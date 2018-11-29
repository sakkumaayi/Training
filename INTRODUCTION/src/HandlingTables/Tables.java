package HandlingTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/21209/pak-vs-aus-2nd-t20i-australia-v-pakistan-in-uae-2018");//driver checks for the objects in complete webpage 
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));//table location is reffered with webElement variable
		//table variable will act as a driver to check for the objects inside the table
		int rowCount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		int runsColumnRowCount=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		int sum =0;
		for(int i=0;i<runsColumnRowCount-2;i++) {
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			sum=sum+Integer.parseInt(value);
		}
		String extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(extras);//extras value//xpath using text as a attribute
		int totalSumValue=sum+extrasValue;
		
		String actualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actualtotalScore=Integer.parseInt(actualTotal);//total value
		if(totalSumValue==actualtotalScore) {
			System.out.println("validating sum of scores with total score  is done "+ totalSumValue+" "+actualtotalScore+" "+"*****************count Matches");
		}else
			System.out.println("count fails");
		
		
	}

}
