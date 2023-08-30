package com.dhruv.chandrayaan;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {  	
    	int x,y,z;
    	
    	String direction;
    	String command;
    	
    	String controllerResponse;
    	
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter Initial X-coordinate: ");
    	x=sc.nextInt();
    	System.out.print("Enter Initial Y-coordinate: ");
    	y=sc.nextInt();
    	System.out.print("Enter Initial Z-coordinate: ");
    	z=sc.nextInt();
    	System.out.print("Enter Initial Direction: ");
    	direction=sc.next();
    	System.out.print("Enter string of command to continue or enter Exit: ");
    	command=sc.next();
    	

        GalacticSpaceCraftController chandrayaan3=new GalacticSpaceCraftController(x,y,z,direction);
        
//        First command
        
        
		/*
		 * controllerResponse=chandrayaan3.executeCommands(command);
		 * getFinalCoordinatesFromResponse(controllerResponse);
		 */
        
        
        
//        Second Command
        
        while(!command.equalsIgnoreCase("Exit")) {
        	
        	controllerResponse=chandrayaan3.executeCommands(command);
        	getFinalCoordinatesFromResponse(chandrayaan3,controllerResponse);
        	System.out.print("Enter string of command to continue or enter Exit: ");
        	command=sc.next();
        
        }
    }

// printing final coordinates and direction using response string
    
	private static void getFinalCoordinatesFromResponse(String controllerResponse) {
		if(controllerResponse.equalsIgnoreCase("Invalid Command")) {
        	System.out.println("Please Use valid Commands");
        }
        else if(controllerResponse.equalsIgnoreCase("Invalid Direction")) {
        	System.out.println("Please Use valid Direction");
        }
        else {
        	String finalPosition[]=controllerResponse.split(",");
            System.out.println("Final Coordiantes: ("+finalPosition[0]+","+finalPosition[1]+","+finalPosition[2]+")");
            System.out.println("Final Direction: "+finalPosition[3]);
        } 
		
	}
	
// printing final coordinates and direction using getters and setters.

	private static void getFinalCoordinatesFromResponse( GalacticSpaceCraftController chandrayaan3,String controllerResponse) {
		if(controllerResponse.equalsIgnoreCase("Invalid Command")) {
        	System.out.println("Please Use valid Commands");
        }
        else if(controllerResponse.equalsIgnoreCase("Invalid Direction")) {
        	System.out.println("Please Use valid Direction");
        }
        else {
            System.out.println("Final Coordiantes: ("+chandrayaan3.getX()+","+chandrayaan3.getY()+","+chandrayaan3.getZ()+")");
            System.out.println("Final Direction: "+chandrayaan3.getDirection());
        } 
		
	}
}
