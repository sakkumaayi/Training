import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//when there are no unique attribute values for an object we can create xpath for the parent then carefully traverse to the child 
//syntax parent xpath/ tagnames
public class IdentifyXpathWithParentChildTraverseRelationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
				driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div/input")).sendKeys("google");
				driver.findElement(By.xpath("//div[@class='FPdoLc.VlcLAe']/input[1]")).click();
	}

}
