package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HomeLoan2 {
	@Test
	public void mobileLogin() {
		//appium
		System.out.println("mobilelogin homeloan");

	}
	@Test(groups= {"smoke"})
	public void WebLogin() {
		//selenium
		System.out.println("weblogin homeloan");

	}
	@Test(dataProvider="getdata")
	public void APILogin(String username, String password) {
		//Rest automation
		System.out.println("APIlogin homeloan");
		System.out.println(username);
		System.out.println(password);

	}
	@DataProvider
	public Object getdata() {
		/*test with multiple data sets for loan approval
		1st combination username password good credit history
		2nd combination username password no credit history
		3rd combination username password fradulent credit history*/
		
		//3combinations =3 rows
		//and each combination has 2 values=2 columns
		
		Object[][] data=new Object[3][2];
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
	return data;	

	}
}
