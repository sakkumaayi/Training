import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
 * Every object may not have id,name,class name so we prefer to identify by css and xpath locators
 * id(alpha numeric) may vary on every refresh so we need to check it by refreshing the page multiple times to make sure Id is not changing everytime we refresh
 * confirm the link object with anchor <a> tag
 * class name should not have spaces otherwise error occurs saying "compound class names not permitted"
*when two objects have same attribute value selenium finds the first object as selenium tries to find object from top left
*eg:username and password both objects have same ID then when we try to identify these attributes with id username object is identifed always and password is never identified as selenium always finds the objects from top left
**/
public class EnterTextInATextBoxUsingLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoke chrome driver exe file first
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
				//create a driver object for ChromeDriver class and refer it with WebDriver(Interface) variable
				//then we have to implement methods of interface WebDriver
				WebDriver d = new ChromeDriver();
		
		
				//	d.get("http://facebook.com");
				/*d.findElement(By.id("email")).sendKeys("santhusha_tummala@yahoo.com");
				d.findElement(By.name("pass")).sendKeys("entertain");
				d.findElement(By.linkText("Forgot account?")).click();;*/
				
				////////////////////identifying facebook objects using xpath and css locator/////////////////////////
				//d.findElement(By.cssSelector("#email")).sendKeys("ainesh");
				//there is no direct way to find css selector in chrome. can find it in the tool bar.
				
				
				//==========could not copy css locator in chrome browser and have to retry==============
				//d.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("hello");
				//d.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
				//d.close();
				
				
				
				d.get("http://login.salesforce.com");
				d.findElement(By.id("username")).sendKeys("hello");
				d.findElement(By.name("pw")).sendKeys("hello");
				//d.findElement(By.className("input r4 wide mb16 mt8 password")).click();//class name with spaces is not allowed in selenium
				d.findElement(By.xpath("//*[@id=\'Login\']")).click();
				System.out.println(d.findElement(By.cssSelector("div#error.loginError")).getText());
				
				
				
				//double quotes inside double quotes is not allowed
				//xpath can be generated in 'n' number of ways
				// * xpath and css can be different in different browsers for the same element
				// */
				//Right click on blue highlighted html code to generate and copy the xpath
				//firepath depreciated from firefox 56 version
				// xpath beginning with html is not reliable so switch browsers and try to get another xpath
				// To validate xpath in the browser before putting in the script we use $x("xpath after replacing double quotes with single quotes") and then press enter
				 // To validate css we use $("css path")
				 //validation is done in console tab when we Inspect element
				 //with out validating xpath and css when we use it in script(script run takes time and we will come to know about wrong xpath and css after executing scripts(time waste) by validating we can save time) 
				 //when we enter xpath $x("")in the console tab the browser will give a object,when we place cursor on the object that object is highlighted in the application browser in blue.
				 //
				
				
				//Xpath  can be written in many ways using different attributes
				//xpath syntax-------------------//tagname[@attribute='value']
				 //------------we can exclude tagname and replace it with * like this //*[@attribute='value']
				
				//css selector Syntax-------------------tagname[attribute='value'] or[attribute='value'] or tagname#id when id is declared for that element or tagname.classname when element is declared by class name
				//for css selector we can skip tagname
				
				//when a part of an attribute value is changing consistently then we have to use regular expressions for writing xpath
				//eg:value is username12 then changed to username123
				//xpath syntax ------ //tagname[contains(@attribute,'value')] eg: //input[contains(@name,'Username')]
				
				//css sytax with regular expressions-----------tagname[attribute*='value] eg: input[name*='username']
				//we also can use regular expression when a vale of an attribute is long like 30-40 characters 
				//we can take first few characters that are unique and replace others with *.
	}


}
