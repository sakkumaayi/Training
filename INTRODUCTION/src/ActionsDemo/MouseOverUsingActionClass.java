package ActionsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseOverUsingActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions a=new Actions(driver);
		//WebElement hoverOnWebElement=driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]/span[2]"));
		WebElement hoverOnWebElement=driver.findElement(By.xpath("//a[contains(@href,'ref=nav_prime_try_btn')]/span[2]"));
		a.moveToElement(hoverOnWebElement).build().perform();
		a.moveToElement(hoverOnWebElement).contextClick().build().perform();//contextClick() is used for right clicking

		//composite action using Actions class by combining multiple actions
		//a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").sendKeys(Keys.ENTER).build().perform();
		
		
		//how to drag and drop is pending
		
		
	}

}
