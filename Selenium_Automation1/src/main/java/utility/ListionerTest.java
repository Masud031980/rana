package utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import zoopla.uk.baseclass.SuperClass;

public class ListionerTest extends SuperClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		logger.info("Test started : "+  context.getName());
	
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test is done : "+  context.getName());
		// TODO Auto-generated method stub
		
	}

}
