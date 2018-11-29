package miscelleaous;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//cast driver object to TakeScreenshot Type
		FileUtils.copyFile(src, new File("C:\\Users\\santh\\Desktop\\ScreenshotfromSelenim.png"));
	}

}
