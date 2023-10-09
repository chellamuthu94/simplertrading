package browserstock;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.appium.java_client.android.AndroidDriver;
  
public class stack {
	static AndroidDriver driver = null;
public static DesiredCapabilities de = new DesiredCapabilities();
	//public static String USERNAME="fourbendsit1";
	public static String USERNAME="naganandhini_abhRrD";		
	//public static String PASSWORD="ABs2smszgcb93AxmeiFJ";
	public static String PASSWORD="GHaDJSGpsc76rDaWXNtH";
	//public static String url="https://"+USERNAME+":"+PASSWORD+"@hub-cloud.browserstack.com/wd/hub";

	@SuppressWarnings("deprecation")
	@Test
	
	@Parameters({"browser"})
	public void test(String browser) throws InterruptedException, IOException {
		
		
		
		
	
	if (browser.contentEquals("samsung")) {
    
	de.setCapability("platformName", "android");
	de.setCapability("platformVersion", "12.0");
    de.setCapability("deviceName", "Samsung Galaxy S22 Ultra");  
     
   
	}
	else if(browser.contentEquals("googlepixel")) {
		de.setCapability("platformName", "android");
		de.setCapability("platformVersion", "13.0");
	     de.setCapability("deviceName", "Google Pixel 7 Pro");  
	    
		}
	else if(browser.contentEquals("oneplus")) {
de.setCapability("platformName", "android");
de.setCapability("platformVersion", "11.0");
de.setCapability("deviceName", "OnePlus 9");  
	     

		}
      //de.setCapability("app", "bs://56ec662197b47a336bbf6784a8d825657ffd7a37");
	de.setCapability("app", "bs://eb2a237db21ca4e74ab5521e34e8589bd5cd2258");
    URL url = new java.net.URL("https://"+USERNAME+":"+PASSWORD+"@hub-cloud.browserstack.com/wd/hub");
	driver= new AndroidDriver(url,de);

 //driver= new AndroidDriver(new URL(url),de);
PageFactory.initElements(driver, pom.class);
	
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

 //  pom.allow1.click();
   pom.username.sendKeys("roomtest1@simplertrading.com");
   pom.touch.click();

  pom.password.sendKeys("4IW6i8vINHxWD@1upABBOqxG");
  pom.touch.click();

 pom.login.click();
 homepage.homepage1();
 tradingroom.test1();
 alert.alert1();
filesdownloadvalidation.files1();
 
search.search1();
mute.mute1();    
}
	
public static AndroidDriver getDriver()
	{
		
	    return driver;
	}	

	
}