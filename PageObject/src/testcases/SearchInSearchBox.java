package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffHomePage;
import ObjectRepository.RediffHomePageUsingPageFactory;

public class SearchInSearchBox {
	
	@Test
	public void homePageSearchBox() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.rediff.com/");
		/*RediffHomePage rdhp=new RediffHomePage(driver);
		rdhp.clickOnSearchLinkInHomePage().click();
		rdhp.clickOnSearchBoxInHomePage().sendKeys("hello");
		rdhp.clickOnSearchButtonInHomePage().click();*/
		RediffHomePageUsingPageFactory rdhp_pf=new RediffHomePageUsingPageFactory(driver);
		rdhp_pf.clickOnSearchLinkInHomePage().click();
		rdhp_pf.clickOnSearchBoxInHomePage().sendKeys("hello");
		rdhp_pf.clickOnSearchButtonInHomePage().click();
	}
	
}
