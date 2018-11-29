package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePageUsingPageFactory {
WebDriver driver;
	
	public RediffHomePageUsingPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id='srch_show_hide_btn']/div[2]/u")
	WebElement searchLink;
	@FindBy(className="homesrchbox")
	WebElement searchBox;
	@FindBy(className="newsrchbtn")
	WebElement searchButton;
	
	public WebElement clickOnSearchLinkInHomePage() {
		return searchLink;
	}
	public WebElement clickOnSearchBoxInHomePage() {
		return searchBox;
	}
	public WebElement clickOnSearchButtonInHomePage() {
		return searchButton;
	}
}
