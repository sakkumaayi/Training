package HandlingCalendarsInRealTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderOnMakeMyTripWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://makemytrip.com/flights/");
		driver.findElement(By.id("hp-widget__depart")).click();

			while(!(driver.findElement(By.cssSelector("[class='ui-datepicker-title'] [class='ui-datepicker-month']")).getText().equalsIgnoreCase("February"))) {
				driver.findElement(By.xpath("//*[@class='dateFilter hasDatepicker']/div/div[2]/div/a/span")).click();
			}
		int count=driver.findElements(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td/a[@class='ui-state-default']")).size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String s=driver.findElements(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td/a[@class='ui-state-default']")).get(i).getText();		
			if(s.equalsIgnoreCase("11")){
				driver.findElements(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td/a[@class='ui-state-default']")).get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("hp-widget__return")).click();
		while(!(driver.findElement(By.xpath("//div[@class='dateFilterReturn hasDatepicker']/div/div[2]/div/div/span[@class='ui-datepicker-month']")).getText().equalsIgnoreCase("April"))) {
			driver.findElement(By.xpath("//div[@class='dateFilterReturn hasDatepicker']/div/div[2]/div/a/span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		int count1=driver.findElements(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td/a[@class='ui-state-default']")).size();
		System.out.println(count1);
		
		for(int i=0;i<count1;i++) {
			String s=driver.findElements(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td/a[@class='ui-state-default']")).get(i).getText();		
			if(s.equalsIgnoreCase("24")){
				driver.findElements(By.xpath("//*[@class='ui-datepicker-group ui-datepicker-group-last']/table/tbody/tr/td/a[@class='ui-state-default']")).get(i).click();
				break;
			}
		}
	}

}
