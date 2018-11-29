package test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener is the interface that implements testng listeners
public class listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {//difference between beforemethod and onTestSuccess
		//beforemethod test runs whether or not test fails or pass but
		//onTestSuccess method runs only when test pass and used to take screenshots when test fails
		
		// TODO Auto-generated method stub
		//System.out.println("test sucess"+ " "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//System.out.println("test failure");
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
