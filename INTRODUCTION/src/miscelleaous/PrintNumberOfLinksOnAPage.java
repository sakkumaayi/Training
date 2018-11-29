package miscelleaous;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintNumberOfLinksOnAPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println("Count of links on this page = "+driver.findElements(By.tagName("a")).size());
		
		//limiting the webDriver scope by creating a mini driver object
		
		WebElement footerDriver=driver.findElement(By.id("gf-BIG"));
		System.out.println("count of links that are present on the footer after limiting the driver scope: "+footerDriver.findElements(By.tagName("a")).size());
		WebElement subFooterDriver=footerDriver.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));
		int count=subFooterDriver.findElements(By.tagName("a")).size();
		System.out.println("sub footer links count: "+count);
		//to open a click in a tab press and hold on the ctrl button and click the link then the link opens in a new tab or ctrl+enter
		
		
		///////////////////////Interview Questin/////////////////////////////////////////
		//what have done in your selenium job that is mostly appreciated by everyone
		//validating 20 links 
		//instead of opening a link and going back to home page and then click on another link and then again open second link and go back repeat this for 20 times
		//I have opened all the links in separate tabs by using keys(ctrl+enter) and get the titles of the pages by window handling
		
		
		
		
		for(int i=1;i<count;i++) {
			String openLinkInATab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			subFooterDriver.findElements(( By.tagName("a"))).get(i).sendKeys(openLinkInATab);
		}
		Set<String> windowIds=driver.getWindowHandles();
		Iterator<String> it= windowIds.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}

}
