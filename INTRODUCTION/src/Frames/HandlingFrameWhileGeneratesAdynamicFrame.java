package Frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameWhileGeneratesAdynamicFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://fantasycricket.dream11.com/IN/");

/*import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebDriverException;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;*/

public class Day extends Day1{

public static void main(String[] args) {

// TODO Auto-generated method stub

WebDriver driver=new FirefoxDriver();

WebDriverWait wd=new WebDriverWait(driver,7);

driver.get("https://fantasycricket.dream11.com/IN/");

driver.manage().window().maximize();

int m=gotoframe(driver,By.xpath(".//*[@id='recaptcha-anchor']"));

driver.switchTo().frame(m);

driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();

driver.switchTo().defaultContent();

wd.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.id("I1_1441700500937")));

int j=gotoframe(driver,By.xpath(".//*[@id='recaptcha-verify-button']"));

if(j!=-1)

{

driver.switchTo().frame(j);

//WebDriverWait wd=new WebDriverWait(driver,5);

//wd.until(ExpectedConditions.(By.xpath(".//*[@id='recaptcha-verify-button']")));

driver.findElement(By.xpath(".//*[@id='recaptcha-verify-button']")).click();

}

else{

System.out.println("ops");

}

}

}

	}

}
