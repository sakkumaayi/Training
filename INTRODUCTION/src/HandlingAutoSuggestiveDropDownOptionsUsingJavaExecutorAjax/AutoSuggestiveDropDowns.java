package HandlingAutoSuggestiveDropDownOptionsUsingJavaExecutorAjax;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//Auto suggestive drop down elements are Ajax elements that are automatically and dynamically generated in the a HTML
//These Ajax elements are mostly hidden from the html page(i.e we cannot extract the text using getText() method in selenium) 
//selenium cannot identify hidden elements(Ajax implementation)
//We have use Javascript DOM to get these values for doing this selenium developed API called JavaScriptExecutor
//JavascriptExecutor is used to get the values of hidden elements that are developed using Ajax
public class AutoSuggestiveDropDowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://ksrtc.in/oprs-web//");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);

		JavascriptExecutor js=(JavascriptExecutor)driver;
		//Go to console on Web browser utility and enter document.
		String script="return document.getElementById(\"fromPlaceName\").value;";//double quotes inside double quotes is not acceptable in java so include a slash
		String text=(String) js.executeScript(script);
		//System.out.println(text);
		int i=0;

		while(!text.equalsIgnoreCase("bengaluru internation aiport")) {//validation condition text equals bengaluru internation aiport
			i++;
			if(i<10) {
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			System.out.println();
			}
			else {
				System.out.println("Element is not found");
				break;
			}
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//Go to console on Web browser utility and enter document.
			script="return document.getElementById(\"fromPlaceName\").value;";//double quotes inside double quotes is not acceptable in java so include a slash
			text=(String) js.executeScript(script);
			System.out.println(text);
		}
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("toPlaceName")).sendKeys("gghjk");

	}

}
