import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataIntoATextBoxUsingLocators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("http://facebook.com");
	d.findElement(By.id("email")).sendKeys("santhusha_tummala@yahoo.com");
	
	
}
}
