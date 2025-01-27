package project1;

import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class calculatorTest {
	private calculator cal;
	
	@Before
	public void setup() {
		cal = new calculator();
	}
	
	@Test
	public void testAdd()
	{
		assertEquals(5,cal.add(3, 2));
	}
	
	@Test
	public void testSub()
	{
		assertEquals(7,cal.subtract(3, 2));
	}
	
	@Test
	public void testMultiply()
	{
		assertEquals(cal.multiply(3, 2),8);
	}
	
	@Test
	public void testDivide()
	{
		assertEquals(cal.divide(6, 3),2);
	}
	
}
