import static org.junit.Assert.*;

import org.junit.Test;

public class MainPanelTest {

	//First pinning test for convertToInt() method
	@Test
	public void PositiveInt() {
	
		assertTrue(MainPanel.convertToInt(1) == 1);
				
	}
	//Second pinning test for convertToInt() method
	@Test
	public void NegativeInt() {

		assertTrue(MainPanel.convertToInt(-1) == -1);
				
	}
	//Third pinning test for convertToInt() method
	@Test
	public void ZeroInt() {
	
		assertTrue(MainPanel.convertToInt(0) == 0);
				
	}
	

}
