package TechniquesToAutomateWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticAndDynamicDropdownOnSpiceJetWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://spicejet.com");
		//Static drop down menu passenggers try again
		//========================================
		//d.findElement(By.xpath("//*[@id=\'divpaxinfo\']")).click();
		//d.findElement(By.xpath("//div[@class='ad-row-right']")).click();
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		//Dynamic drop down menu
		//=====================================================================
		d.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		d.findElement(By.xpath("//a[@value='GOI']")).click();
		d.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		
		//currency static dropdown menu by using select class
				d.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
				Select s=new Select(d.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']")));
				//d.findElement(By.xpath("//*[@id=\'ctl00_mainContent_DropDownListCurrency\']")).click();//*[@id="hrefIncAdt"]//*[@id="spanAudlt"]
				//s.selectByValue("USD");
				s.selectByIndex(3);
				s.selectByVisibleText("AED");
				
				
				//click on checkboxes and use isDisplayed(returns true or false) method to know if it is clicked  or not
				//isSeelected to check if check box is already selected
				//isDispalyed
				//isEnabled
				
				System.out.println(d.findElement(By.cssSelector("input#ctl00_mainContent_chk_StudentDiscount")).isDisplayed());
				d.findElement(By.cssSelector("input#ctl00_mainContent_chk_StudentDiscount")).click();;//by css selector using id attribute
				System.out.println(d.findElement(By.cssSelector("input#ctl00_mainContent_chk_StudentDiscount")).isDisplayed());
				
	} 

}
