package jar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for Calc class.
 * 
 */
class CalcTest{
	
	@Test
	public void addTest(){
		
		Calc myCalc = new Calc();
		int sum = myCalc.add(1, 4);
		Assertions.assertEquals(sum, 5);
	}
	@Test
	public void subtractTest(){
		
		Calc myCalc = new Calc();
		int sub = myCalc.subtract(1, 4);
		Assertions.assertEquals(sub, -3);
	}
}
