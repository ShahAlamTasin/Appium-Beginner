package Appium_Test.Test_Deadline;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
 
public class Appium_First {
	AppiumDriverLocalService service;
	AndroidDriver driver;
	
	@BeforeClass
	public void BeforeAppiumTest() throws MalformedURLException {
		
	
			/* service =  new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\shaha\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
						.withIPAddress("127.0.0.1").usingPort(4723).build();
				
			 service.start();
				  
		 */
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName("Device 1");
				options.setApp("C:\\Users\\shaha\\OneDrive\\Desktop\\java projects\\Test_Deadline\\src\\test\\java\\resources\\nopstationCart_4.40.apk");
				 driver =  new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
				 
				 
				 
					
	}
	

	@AfterClass
	public void AfterAppiumTest() {
		driver.quit();
	    // service.stop();
	}
	

}
