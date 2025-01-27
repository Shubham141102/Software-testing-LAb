package project1;
import java.util.Scanner;
public class factorial {
	Scanner myObj = new Scanner(System.in);
	
	
	public int factorial(int n)
	{
		int fact = 1;
		for(int i=1;i<=n;i++)
		{
			fact = fact *  i;
		}
		return fact;
	}
	
	
	
}
