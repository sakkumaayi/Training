import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setBrowserName("chrome");
	dc.setPlatform(Platform.LINUX);
	ChromeOptions options=new ChromeOptions();
	options.setBinary("C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
	options.merge(dc);
	//dc.setCapability("chrome.binary",new File("C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe").getAbsolutePath());
	WebDriver driver=new RemoteWebDriver(new URL("http://192.168.56.1:4442/wd/hub"),dc);//ip address of local machine
	driver.get("https://www.amazon.com/");
}
}
