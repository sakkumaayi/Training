package test;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IntrodutionTestcase {
	@AfterTest//this will exceucte last in test folder level
	public void exceutlast() {
		System.out.println("@AfterTest:   in IntrodutionTestcase  class    I will execute last");
	}
	@Test(groups= {"smoke"})//to run a test case
	public void demo() {
		System.out.println("hello world");
	}
	@Parameters({"URL"})
	@Test
	public void SecondTestCase(String urlname) {
		System.out.println("bye");
		System.out.println(urlname);

	}
	@AfterSuite
	public void afterSuitetest() {
		System.out.println("@AfterSuite:  in IntrodutionTestcase  class   Iam executing last no.last");
	}
}
