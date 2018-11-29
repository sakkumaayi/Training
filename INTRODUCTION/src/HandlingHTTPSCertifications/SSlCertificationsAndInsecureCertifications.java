package HandlingHTTPSCertifications;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
//when an SSL ceritificate page opens in a chrome browser warns us saying "site security is not trusted"
//when an insecure page is tryin to be opened browser says eg: "your connecction is not private"
//in any of these situations to proceed to a website page we have to click "proceed anyway" button.

//while testing we can provide knowledge to a local browser by using Desired capabilities class .
//Desired capabilities object should be passed to chromeOptions class which acts as our local browser
//chromeOptions object should be passed to chromeDriver();
public class SSlCertificationsAndInsecureCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities capabilitiesChromebrowser=new DesiredCapabilities();
		//chromebrowser.acceptInsecureCerts();//this object should be passed to chromeOptions Class
		//alternate for above step as below:
		capabilitiesChromebrowser.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		capabilitiesChromebrowser.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		ChromeOptions c=new ChromeOptions();
		c.merge(capabilitiesChromebrowser);//merge DesiredCapabilities and ChromeOptions objects
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santh\\Desktop\\Selenium\\browers exe files\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);//pass on the ChromeOptions object to chromeDriver() object after merging ChromeOptions and  DesiredCapabilities
		//now driver has the knowledge of handling certifications whenever a webpage warning with certifications is opened browser will click proceed anyway button and goes to the insecure webpage
		
	}

}
