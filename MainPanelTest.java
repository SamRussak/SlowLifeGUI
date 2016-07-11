import static org.junit.Assert.*;

import org.junit.Test;

public class MainPanelTest {

	//First pinning test for convertToInt() method	
	//Method should act same as before refactoring
	//This test makes sure the method works with positive integers
	@Test
	public void PositiveInt() {
	
		assertTrue(MainPanel.convertToInt(1) == 1);
				
	}
	//Second pinning test for convertToInt() method
	//Method should act same as before refactoring
	//This test makes sure the method works with negative ints
	@Test
	public void NegativeInt() {

		assertTrue(MainPanel.convertToInt(-1) == -1);
				
	}
	//Third pinning test for convertToInt() method
	//Method should act same as before refactoring
	//This test makes sure the method works with 0 
	@Test
	public void ZeroInt() {
	
		assertTrue(MainPanel.convertToInt(0) == 0);
				
	}
	
	//First pinning test for toString() method
	//Method should act same as before refactoring
	//This test makes sure the method works with an"X" string
	@Test
	public void XString() {
	
		Cell c = new Cell();
		c.setText("X");
		assertTrue(c.toString().equals("X"));		
	}
	
	//Second pinning test for toString() method
	//Method should act same as before refactoring
	//This test makes sure the method works with No string
	@Test
	public void NoString() {
	
		Cell c = new Cell();
		c.setText(" ");
		assertTrue(c.toString().equals("."));		
	}
	
	//Third pinning test for toString() method
	//Method should act same as before refactoring
	//This test makes sure the method works with extended string
	@Test
	public void LongString() {
	
		Cell c = new Cell();
		c.setText("Xfiej");
		assertTrue(c.toString().equals("X"));		
	}

}
