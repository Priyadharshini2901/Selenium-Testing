package MavenProject1.TestingNg;

import org.testng.annotations.Test;

public class Calculator
{
	@Test
    public int add(int a, int b)
    {
       return a+b;
    }
	
	@Test
	public int sub(int a, int b)
	{
		return a-b;
	}
	
	@Test
	public int mul(int a,int b)
	{
		return a*b;
	}
	
	@Test
	public int div(int a,int b)
	{
		return (a/b);
	}
}
