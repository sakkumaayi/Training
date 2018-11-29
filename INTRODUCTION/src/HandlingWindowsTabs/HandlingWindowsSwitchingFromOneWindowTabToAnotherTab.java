package HandlingWindowsTabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindowsSwitchingFromOneWindowTabToAnotherTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		System.out.println(driver.getTitle());//driver is in signin page
		
		Actions a = new Actions(driver);
		WebElement helpLink=driver.findElement(By.xpath("//*[@id=\'initialView\']/footer/ul/li[1]/a"));
		a.moveToElement(helpLink).click().build().perform();
		System.out.println(driver.getTitle());//after clicking on the help link driver is still in signin page
		//to switch window from signin page to help page 
		//first we have get all the window handles and collect them in a set variable
		//Second iterate through the Set using iterator() method and refer it with an Iterator variable
		Set<String> windowIds=driver.getWindowHandles();

		Iterator<String> it= windowIds.iterator();//set is fifo(first in first out) so parent window is in first position and childwindow is in second poisition
		//windows are stored in the order they are opened and when we iterate through the set first we retrieve the first window that is opened first(parent window) in the order they are opened
		String parentWindow=it.next();//
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		System.out.println("After switching the driver to child window that is help window");
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindow);
		System.out.println("After switching the driver to parent window that is signin window");
		System.out.println(driver.getTitle());

		


	}

}
