package TechniquesToAutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//alerts are of many types of which
//1.html alerts(which can be inspected using browser tool and get locators to access those pop ups or alerts)
//2.java alerts(can be accessed by using alert class) when we have to handle java alerts access has to be switched from webdriver to alerts
//3.Driver object control has to be switched from web page to alert pop up
////////////////////////////////////////Java alerts///////////////////////////////////////////
public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		/*//java alert code
		d.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		d.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		System.out.println(d.switchTo().alert().getText()); //the text written on the alert box is returned
		d.switchTo().alert().accept();//to click "ok" button on alert box
		//d.switchTo().alert().dismiss();//to click "cancel" button on alert box
		//d.switchTo().alert().sendKeys("alkdjd");//if there is any textbox on the alert box send text using sendkeys() method
		d.close();*/
		
		//html alerts or popups************************try again**************************************************//
		d.get("https://www.goindigo.in/");
		d.findElement(By.xpath("//a[@class='one-way-tab bw-trip-tabs']")).click();
		//d.findElement(By.xpath("//*[@id='globalModal']/div/div/div[3]/button")).click();//*[@id="globalModal"]/div/div/div[3]/button
		//d.switchTo().alert().accept();
		//d.findElement(By.name("OK")).click();
		d.findElement(By.xpath("//*[@text='OK']")).click();
	}

}
