package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable");
		//driver.findElement(By.id("draggable")); gives error as this web element is in a frame

		//driver.switchTo().frame(0);//pass by index is not preffered if developrs adds another frame order of frames changes
		//integer 0 then it identifies first  frame
		//1 then it identifies second frame
		//driver.switchTo().frame(String frameId);//Id is not defined for this web element by developrs
		//frames are component hosted on webpage as a container
		//frames are developed(in html) but separately developed and deployed on a webpage
		
		//how to get frame count
		 int count=driver.findElements(By.tagName("iframe")).size();
		System.out.println("frames count: "+count);
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));//switch to frame by passing webElement of the frame
		driver.switchTo().frame(0);////switch to frame by passing the index of the frame
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		
		driver.findElement(By.id("draggable")).click();
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();//come out of the frame to perform any others actions on the web page
		
		driver.switchTo().defaultContent();//defaultContent switches back driver from frame to webpage
	}

}
