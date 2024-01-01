package MavenProject1.TestingNg;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {
	    
         Calculator cal = new Calculator();
         @Test(dataProvider ="testdata")
         public void testAdd(int num1, int num2, int expected) {
        	 int stored = cal.add(num1,num2);
        	 AssertJUnit.assertEquals(stored, expected);
        	 System.out.print(stored);
         }
         
		 @DataProvider(name = "testdata")
         public Object[][] testdata()
         {
        	 return new Object[][]{
        		 {1,2,3},{2,5,3}
        	 };
         }
         @Test(dataProvider="subdata")
         public void testsub(int num1,int num2,int expected)
         {
        	int stored1 = cal.sub(num1,num2);
        	AssertJUnit.assertEquals(stored1, expected);
        	System.out.print(stored1);
         }
         @DataProvider(name = "subdata")
         public Object[][] testSub()
         {
        	 return new Object[][]{
        		 {3,2,1},{7,5,2},{1,2,3}
        	 };
         }
         
         @Test(dataProvider="muldata")
         public void testmul(int num1,int num2,int expected)
         {
        	int stored2 = cal.mul(num1,num2);
        	AssertJUnit.assertEquals(stored2, expected);
        	System.out.print(stored2);
         }
         @DataProvider(name = "muldata")
         public Object[][] testMul()
         {
        	 return new Object[][]{
        		 {3,2,6},{7,5,35},{1,2,3}
        	 };
         }
         
         
         
	

}
