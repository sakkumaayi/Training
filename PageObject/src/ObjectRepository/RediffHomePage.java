package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	WebDriver driver;
	By searchLink = By.xpath("//*[@id='srch_show_hide_btn']/div[2]/u");
	By searchBox = By.className("homesrchbox");
	By searchButton = By.className("newsrchbtn");
	public RediffHomePage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement clickOnSearchLinkInHomePage() {
		return driver.findElement(searchLink);
	}
	public WebElement clickOnSearchBoxInHomePage() {
		return driver.findElement(searchBox);
	}
	public WebElement clickOnSearchButtonInHomePage() {
		return driver.findElement(searchButton);
	}
}
