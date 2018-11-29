package HandlingCalendarsInRealTime;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText().contains("April")) {
			driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='next']")).click();
		}
		List<WebElement> allDays=driver.findElements(By.className("day"));
		for(int i=0;i<allDays.size();i++) {
			String date=allDays.get(i).getText();
			if(date.equals("23")) {
				allDays.get(i).click();
				break;
			}
		}
	}

}
