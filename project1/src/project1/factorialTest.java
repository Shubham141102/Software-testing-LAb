package project1;

import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class factorialTest {
	private factorial fact;
	
	@Before
	public void setup() {
		fact = new factorial();
	}
	
	@Test
	public void testFactorial()
	{
		assertEquals(120,fact.factorial(5));
	}
}
