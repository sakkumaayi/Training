package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {
	@BeforeClass
	public void beforClass() {
		System.out.println("@BeforeClass: in car loan class   I will execute before all method in class carLoan");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("@AfterClass:  in car loan class      I will execute after all method in class carLoan");
	}
	
	@Test(groups= {"smoke"})
	public void mobileLogin() {
		//appium
		System.out.println("mobilelogin carloan");

	}
	@Test(dependsOnMethods= {"mobileLogin","mobileLogOut"})//mobileLogin method and mobileLogout methods are executed before executing mobileSignin method
	public void mobileSignin() {
		//appium
		System.out.println("mobilesignin carloan");

	}
	@BeforeMethod//executes first in class level //used to delete cookies and caches
	public void beforevery() {
		System.out.println("@BeforeMethod:  in car loan class       I will execute before every method in class carLoan");
	}
	@AfterMethod//executes last in class level //used to delete cookies and caches
	public void afterevery() {
		System.out.println("@AfterMethod:   in car loan class       I will execute after every methodS in class carLoan");
	}
	@Parameters({"URL"})
	@Test
	public void mobileLogOut(String urlname) {
		//appium
		System.out.println("mobilelogout carloan");
		System.out.println(urlname);

	}
	@BeforeSuite//this will exceute first in suite level
	public void beforeSuitetest() {
		System.out.println("@BeforeSuite:   in car loan class        i am executing first No. 1");
	}
	@Test(enabled=false)//when we know that there is a bug(error in application) in this test case and we want to skip it use enabled=false 
	//
	public void WebLogin() {
		//selenium
		
		System.out.println("weblogin carloan");
	}
	@Test(timeOut=4000)//when we have implicit wait of 10sec and this particular test takes 40 sec 
	//we can set timeout for this set and tell to wait for 40 sec before failing using "timeOut" testng helper attributes
	public void APILogin() {
		//Rest automation
		System.out.println("API login carloan");

	}
}
