package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondClassFile {

	@Test(groups= {"smoke"})
	public void  testcase() {
		System.out.println("test cases can be written in multiple classes and group them in the xml file");
	}
	
	@BeforeTest
	public void firstexecute() {
		System.out.println("Beforetest: in SecondClassFile class    I will execute first");
	}
}
