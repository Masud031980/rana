package zoopla.uk.stefdefination;

import org.testng.annotations.Test;

public class TestngAdvanceAnnotation {
	
	@Test (invocationCount =5)
	public void getsalary1() {
		System.out.println("I am test case");
	}
	//How many way you can pass the data
	//1.Excel
	//2.Cucumber  Example table
	//3.TestNG Advance Annotation -Dataprovider
	//4.SQL
	//5.Properties file or text file
	
	//@Listeners
	//@DataProvider
	//@Factory
	
	

}
