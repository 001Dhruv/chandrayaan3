package com.dhruv.chandrayaan;



public class App 
{
    public static void main( String[] args )
    {  	
        GalacticSpaceCraftController chandrayaan3=new GalacticSpaceCraftController(0, 0, 0, "N");
        String controllerResponse=chandrayaan3.executeCommands("ffrubb");
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
}
