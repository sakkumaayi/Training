package TechniquesToAutomateWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.get("http://echoecho.com/htmlforms10.htm");
		
		//d.findElement(By.xpath("//input[@value='Cheese']")).click();
		//d.findElement(By.xpath("//input[@value='Water']")).click();
		//get radiobutton count in that group
		System.out.println(d.findElements(By.xpath("//input[@name='group1']")).size());
		List<WebElement> list=d.findElements(By.xpath("//input[@name='group1']"));
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAttribute("value").contentEquals("Milk")){
				list.get(i).click();
			}
		}
	}

}
