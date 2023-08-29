package com.dhruv.chandrayaan;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Test;



public class GalacticSpaceCraftControllerTest {
	GalacticSpaceCraftController spacecraft;
    @After
    public void destroy() {
    	spacecraft = null;
    }
    
    //Move Forward Test Cases
	@Test
    public void testMoveForwardWithInitDirectionN() {
        spacecraft = new GalacticSpaceCraftController(0,-1,0,"N");
        assertEquals("(0,0,0)-N", spacecraft.executeCommands("f"));
    }
	@Test
    public void testMoveForwardWitInitDirectionS() {
        spacecraft = new GalacticSpaceCraftController(0,-1,0,"S");
        assertEquals("(0,-2,0)-S", spacecraft.executeCommands("f"));
    }
	@Test
    public void testMoveForwardWithInitDirectionE() {
        spacecraft = new GalacticSpaceCraftController(0,-1,0,"E");
        assertEquals("(1,-1,0)-E", spacecraft.executeCommands("f"));
    }
	@Test
    public void testMoveForwardWithInitDirectionW() {
        spacecraft = new GalacticSpaceCraftController(0,-1,0,"W");
        assertEquals("(-1,-1,0)-W", spacecraft.executeCommands("f"));
    }
	@Test
    public void testMoveForwardWithInitDirectionU() {
        spacecraft = new GalacticSpaceCraftController(0,0,0,"U");
        assertEquals("(0,0,1)-U", spacecraft.executeCommands("f"));
    }
	@Test
    public void testMoveForwardWithInitDirectionD() {
        spacecraft = new GalacticSpaceCraftController(0,0,0,"D");
        assertEquals("(0,0,-1)-D", spacecraft.executeCommands("f"));
    }
	
	//Move Backward Test Cases
	
	@Test
    public void testMoveBackwardWithInitDirectionN() {
        spacecraft = new GalacticSpaceCraftController(0,-1,0,"N");
        assertEquals("(0,-2,0)-N", spacecraft.executeCommands("b"));
    }
	@Test
    public void testMoveBackwardWithInitDirectionS() {
        spacecraft = new GalacticSpaceCraftController(0,-1,0,"S");
        assertEquals("(0,0,0)-S", spacecraft.executeCommands("b"));
    }
	@Test
    public void testMoveBackwardWitInitDirectionE() {
        spacecraft = new GalacticSpaceCraftController(0,-1,0,"E");
        assertEquals("(-1,-1,0)-E", spacecraft.executeCommands("b"));
    }
	@Test
    public void testMoveBackwardWitInitDirectionW() {
        spacecraft = new GalacticSpaceCraftController(0,-1,0,"W");
        assertEquals("(1,-1,0)-W", spacecraft.executeCommands("b"));
    }
	@Test
    public void testMoveBackwardWithInitDirectionU() {
        spacecraft = new GalacticSpaceCraftController(0,0,0,"U");
        assertEquals("(0,0,-1)-U", spacecraft.executeCommands("b"));
    }
	@Test
    public void testMoveBackwardWithInitDirectionD() {
        spacecraft = new GalacticSpaceCraftController(0,0,0,"D");
        assertEquals("(0,0,1)-D", spacecraft.executeCommands("b"));
    }
	
}
