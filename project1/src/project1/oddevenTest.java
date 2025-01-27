package project1;


import org.junit.Before;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class oddevenTest {
private oddeven odd;
	
	@Before
	public void setup() {
		odd = new oddeven();
	}
	
	@Test
	public void testFactorial()
	{
		assertEquals(1,odd.oddeven(5));
	}
}
