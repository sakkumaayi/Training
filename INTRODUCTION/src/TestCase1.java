import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//invoke chrome driver exe file first
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		//create a driver object for ChromeDriver class and refer it with WebDriver(Interface) variable
		//then we have to implement methods of interface WebDriver
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");//hit the url
		System.out.println(driver.getTitle());//validate if tiltle is correct
		System.out.println(driver.getCurrentUrl());//validate if you are landed on the correct url
		System.out.println(driver.getPageSource());//print page source
		driver.get("http://yahoo.com");
		driver.navigate().back();//to navigate back from yahoo.com to google.com
		driver.navigate().forward();
		driver.close();//closes current browser
		//driver.quit();//closes all the browser opened by selenium script
		
		       /* //invoke internetExplorer driver exe file first
				System.setProperty("webdriver.ie.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\IEDriverServer\\IEDriverServer.exe");
				//create a driver object for internetExplorerDriver class and refer it with WebDriver(Interface) variable
				//then we have to implement methods of interface WebDriver
				WebDriver driver = new InternetExplorerDriver();
				driver.get("http://google.com");
				System.out.println(driver.getTitle());*/
				
				
				/*//invoke firefox(gecko) driver exe file first
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\geckodriver\\geckodriver.exe");
				//create a driver object for firefoxDriver class and refer it with WebDriver(Interface) variable
				//then we have to implement methods of interface WebDriver
				WebDriver driver3 = new FirefoxDriver();
				driver3.get("http://google.com");
				System.out.println(driver3.getTitle());*/
	}

}
