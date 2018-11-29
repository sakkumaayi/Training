package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizeUsingExplicitWaitImplicitWaitThreadSleepFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//Implicit wait is declared globally the time to wait eg:5 seconds 
		//when we give implicit wait webDriver will wait for the given amount of time  to load a page before throwing exceptions or errors
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait of 5 sec is applied on the web elements which are invoked by WedDriver 'd'
		
		//WebDriver d1=new ChromeDriver();
		//d1.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);//implicit wait of 3 sec is applied when an web element is invoked on 'd1' WedDriver
		
		d.get("https://alaskatrips.poweredbygps.com//g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		d.findElement(By.xpath("//*[@id=\'H-destination\']")).sendKeys("nyc");
		d.findElement(By.xpath("//*[@id=\'H-fromDate\']")).click();
		
		d.findElement(By.xpath("//*[@id=\'H-fromDate-label\']/div/div/div[2]/table/tbody/tr[5]/td[4]/button")).click();
		d.findElement(By.xpath("//*[@id=\'H-toDate\']")).click();
		d.findElement(By.xpath("//*[@id=\"H-toDate-label\"]/div/div/div[3]/table/tbody/tr[5]/td[3]/button")).click();
		//d.findElement(By.xpath("//*[@id='NumAdult1']")).click();////*[@id="NumAdult1"]
		Select s=new Select(d.findElement(By.xpath("//*[@id='NumAdult1']")));
		s.selectByValue("5");
		d.findElement(By.xpath("//*[@id=\'H-searchButtonExt1\']")).click();
		//*[@id="H-searchButtonExt1"]
		
		//below is the implementation of ExplicitWait
		//explicitly we are creating the WebDriverWait object to invoke few elements on it with a wait time of 10 sec
		WebDriverWait driver = new WebDriverWait(d, 10);//driver variable has the knowledge of driver 'd' that we have pased as an argument at the time of object creation
		//and driver behaves as the WebDriver 'd' since it is familiar with it(since passed as an argument in the object instance of WebDriverWait();
		//whenever a web element is invoked with variable 'driver' webDriver will wait for 10 sec(in this scenario) for the webelement  to load before it displays any error or exception
		//driver.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[contains(@href,'New-York-Hotels-Gardens-Suites-Hotel')]")));
		driver.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'New-York-Hotels-Gardens-Suites-Hotel')]")));

		//driver object will waits upto 10 sec till the web element is loaded , if the web element loads before 10 sec it will continue with runningscript 
		d.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-Gardens-Suites-Hotel')]")).click();
		
		//explicit wait is a conditional wait time where we give a condition and we ask the driver to wait until that condition is satisfied and max time to wait is also given when it reaches max time then displays the error or exceptions
		try {
			Thread.sleep(3000L);//sleeps for 3 secs and it is a java method
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//
	}

}
