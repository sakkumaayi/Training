import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PassingParametersFromPropertiesFile {
	@Test
	public void getBrowser() {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		FileInputStream fis=null;
		WebDriver driver=null;
		try {
			fis=new FileInputStream("C:\\Users\\santh\\eclipse-workspace\\SeleniumCreatingGlobalParametersInAPropertiesFile\\DataDriven.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(prop.getProperty("browser").contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
			driver=new ChromeDriver();

		}else if(prop.getProperty("browser").contains("firefox")) {
			
		}else if(prop.getProperty("browser").contains("internet explorer")) {
			
		}
		driver.get(prop.getProperty("URL"));
		
	}

}
