import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneratingCustomizedXpathAndCssSelectorsForElementsUsingRegularExpressionsForRedfinPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in'")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("santhusha");
		driver.findElement(By.cssSelector("[name='passwd']")).sendKeys(",xmnlkdsm");
		driver.findElement(By.xpath("//input[contains(@name, 'procee')]")).click();
	}

}
