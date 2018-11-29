import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
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
public class GeneratingCustomizedCSSANDxpathLocatorsForFaceBookPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ainesh");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("akkdldsfj");
		driver.findElement(By.cssSelector("input[value='Log In']")).click();
	}

}
