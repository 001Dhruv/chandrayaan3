package com.dhruv.chandrayaan;

public class GalacticSpaceCraftController {
	
//	Current Coordinates 
	
	private int x, y, z;
	
	// N, S, E, W, U, D (Direction of Space craft)
	
    private String direction; 

    public GalacticSpaceCraftController(int x, int y, int z, String direction) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.direction = direction;
    }
    
    public void moveForward() {
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

    public void moveBackward() {
  
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
    
    public void turnLeft() {
    }
    
    public void turnRight() {  
    }

    public void turnUp() {
    }

    public void turnDown() {
    }
    
    public String executeCommands(String commands) {
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
            }
            
        }
        return "("+this.x+","+this.y+","+this.z+")-"+this.direction;
    }

}









