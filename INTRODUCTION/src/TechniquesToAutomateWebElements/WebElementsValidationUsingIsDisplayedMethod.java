package TechniquesToAutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsValidationUsingIsDisplayedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.makemytrip.com");
		
			//validating if web element return is present after clicking on multicity using isDisplayed()
		System.out.println("Before clicking the radio button multicity or stop over");
		boolean b=d.findElement(By.xpath("//*[@id=\'hp-widget__return\']")).isDisplayed();
		System.out.println(b);
		/////////////////////////////Assertions////////////////////////////////////
		 //Assert.assertTrue(d.findElement(By.xpath("//*[@id=\'hp-widget__return\']")).isDisplayed());//if the result is true assertTrue will continue the script run 
		 //else if it returns false the assertTrue will stop running script
		 // because assertTrue continues the script run only when the argument return true
		// assertFalse method should return false to continue the script run
		// if you want to validate a web element that returns false to assertFalse to continue the script
	
		d.findElement(By.xpath("//*[@id=\'multicity\']/label")).click();
		
		System.out.println("After clicking the radio button multicity or stop over");
		boolean bAfterClickingOnMultiCity=d.findElement(By.xpath("//*[@id=\'hp-widget__return\']")).isDisplayed();
		System.out.println(bAfterClickingOnMultiCity);
		
		//d.findElement(By.xpath("//*[@id=\'multi\\city\']/label")).isDisplayed();//this statement will throw error because this particular web element(object) 
		//is not present in the web page as the object is removed from the code so cannot use isDisplayed method in this condition 
		//isDisplayed is used only a web element is hidden in the web page but present in the code.
		//isDisplayed() method is used to check if a web element is in visible mode or hidden mode
		//but we cannot use when a web element is removed from the code
		
		
		//if u want to validate the object which is present in the webpage or in the code base
		//when a web element is removed from the code and the test case is to check if that particular web element is removed or not
		int count= d.findElements(By.xpath("//*[@id=\'mulicity\']/label")).size();
		
		if (count ==0) {
			System.out.println("verified. web element is not present");
		}
		
		//isEnabled is a method that is used when an object is disabled in a webpage and not enabled that means when we click that object it is not clicked.
		
		
		//To validate if a text is present in the webpage
		//find element using the xpath of the text and call gettext() method
		
		System.out.println(d.findElement(By.xpath("//*[@id=\'fd-wrap\']/div[2]/h2")).getText());
		d.findElement(By.xpath("//*[@id=\'hp-widget__depart\']")).click();
		try {
			Thread.sleep(10000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//*[@class='dateFilter hasDatepicker']/div/div[1]/table/tbody/tr[5]/td[3]/a
		}
		d.findElement(By.xpath("//*[@class='dateFilter hasDatepicker']/div/div[1]/table/tbody/tr[5]/td[3]/a")).click();
		d.findElement(By.xpath("//*[@id=\'hp-widget__paxCounter_pot\']")).click();
		d.findElement(By.xpath("//*[@id=\'js-adult_counter\']/li[5]")).click();
		d.findElement(By.xpath("//*[@id=\'js-child_counter\']/li[3]")).click();
		d.findElement(By.xpath("//*[@id=\'business\']")).click();
		
		//d.findElement(By.xpath("//*[@id=\'hp-widget__sTo\']")).click();
		d.findElement(By.xpath("//*[@id=\'searchBtn\']")).click();
		
	}

}
