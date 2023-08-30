package com.dhruv.chandrayaan;

public class GalacticSpaceCraftController {
	
//	Current Coordinates 
	
	private int x, y, z;
	
	// N, S, E, W, U, D (Direction of Space craft)
	
    private String direction; 
    
//    Constructor
    
	public GalacticSpaceCraftController(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction.toUpperCase();
    }
	
//	getters and setters
	
    public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	
    
/*   	
 		Actual function performing the task
		Will return value in form of string representing x,y,z,direction 
*/
	
	
    
	public String executeCommands(String commands) {
		if(!isDirectionValid()) {
//			System.out.println("Please Enter valid Direction");
			return "Invalid Direction";
		}
        for (char command : commands.toLowerCase().toCharArray()) {
            switch (command) {
                case 'f':
                    moveForward();
                    break;
                case 'b':
                    moveBackward();
                    break;
                case 'l':
                    turnLeft();
                    break;
                case 'r':
                    turnRight();
                    break;
                case 'u':
                    turnUp();
                    break;
                case 'd':
                    turnDown();
                    break;
                default:
//               	System.out.println("Please Enter valid Command.");
                	return "Invalid Command";
            }
            
        }
		/*
		 * System.out.println("Final Coordiantes: ("+this.x+","+this.y+","+this.z+")");
		 * System.out.println("Final Direction: "+this.direction);
		 */
        return this.x+","+this.y+","+this.z+","+this.direction;
    }
	
	/*
	 * isDirectionValid will check if the entered direction is valid and will return
	 * boolean value true-for valid direction false-for invalid direction
	 */
	
	private boolean isDirectionValid() {
    	String directionInitials="NSEWUD";
		if(!directionInitials.contains(direction)) {
			return false;
		}
		return true;
	}
    
	/*
	 * Moves the space craft in forward or backward direction based on current direction and
	 * coordinate. this will only change coordinates and not direction.
	 */
	
	private void moveForward() {
        if ("N".equals(direction)) {
            y++;
        } 
        else if ("S".equals(direction)) {
            y--;
        } 
        else if ("E".equals(direction)) {
            x++;
        } 
        else if ("W".equals(direction)) {
            x--;
        }
        else if ("U".equals(direction)) {
        	z++;
        }
        else if ("D".equals(direction)) {
        	z--;
        }
    }

    
    
	private void moveBackward() {
  
        if ("N".equals(direction)) {
            y--;
        } 
        else if ("S".equals(direction)) {
            y++;
        } 
        else if ("E".equals(direction)) {
            x--;
        } 
        else if ("W".equals(direction)) {
            x++;
        }
        else if ("U".equals(direction)) {
        	z--;
        }
        else if ("D".equals(direction)) {
        	z++;
        }
    }
    
    /*
	 * Turns the space craft to left or right direction based on current direction.
	 *  this will only change direction and not coordinates.
	 */
    
	private void turnLeft() {
    	 if ("N".equals(direction)) {
             direction = "W";
         } 
    	 else if ("S".equals(direction)) {
             direction = "E";
         } 
    	 else if ("E".equals(direction)) {
             direction = "N";
         } 
    	 else if ("W".equals(direction)) {
             direction = "S";
         }
    	 else if ("U".equals(direction)) {
         	direction = "N";
         }
    	 else if ("D".equals(direction)) {
         	direction = "S";
         }
    }
    
	private void turnRight() { 
    	 if ("N".equals(direction)) {
             direction = "E";
         } 
    	 else if ("S".equals(direction)) {
             direction = "W";
         } 
    	 else if ("E".equals(direction)) {
             direction = "S";
         } 
    	 else if ("W".equals(direction)) {
             direction = "N";
         }
    	 else if ("U".equals(direction)) {
         	direction = "S";
         }
    	 else if ("D".equals(direction)) {
         	direction = "N";
         }
    }

    /*
   	 *  1)Turns the space craft to up or down direction.
   	 *  2)This will only change direction and not coordinates.
   	 *  3)In any case if command includes 'u' then direction of spacecraft will change to 'U'. 
   	 *    Irrespective of direction and similar is the case with 'd'.
   	 */
       
    
	private void turnUp() {
    	direction = "U";
    }

	private void turnDown() {
    	direction = "D";
    }
}









