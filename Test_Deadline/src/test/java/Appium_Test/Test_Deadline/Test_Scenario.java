package Appium_Test.Test_Deadline;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Test_Scenario extends Appium_First {
	Test_Scenario_2 InputData = new Test_Scenario_2();
	
	
	public void vericalscroll(WebElement element, double percent) {
		
		 int start_X3 =  element.getSize().getWidth()/3;

			int start_Y3 = (int) (element.getSize().getHeight());
			
			int end_y3 = (int) (element.getSize().getHeight() * percent);
	
			new TouchAction(driver).press(PointOption.point(start_X3,start_Y3)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
			.moveTo(PointOption.point(start_X3,end_y3)).release().perform();
	}
	
	 public void horizontalscroll(WebElement element, int partition, int subtractfromright ) {
		 int LeftX = element.getLocation().getX();
         int RightX = LeftX+element.getSize().getWidth();
	     int centerY = element.getLocation().getY() + (element.getSize().getHeight()/partition);
			new TouchAction(driver).press(PointOption.point(RightX-subtractfromright,centerY)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(5000)))
			.moveTo(PointOption.point(LeftX,centerY)).release().perform();
	 }

	@SuppressWarnings("rawtypes")
	@Test
	public void Test_Demo() throws InterruptedException, IOException {
		InputData.Test_Demo_2();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		/*
		 * 	WebDriverWait driver_wait =  new WebDriverWait(driver,Duration.ofSeconds(10));
		
	    driver_wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.className("android.widget.Button")));
		 */

	 driver.findElement(AppiumBy.className("android.widget.Button")).click();
	 
	 
	 // Appium Gessture
	 // https://github.com/appium/appium-uiautomator2-driver/blob/master/docs/android-mobile-gestures.md
	 
	
	 
	 //adb uninstall io.appium.uiautomator2.server
	 //adb uninstall io.appium.uiautomator2.server.test
	 
	 

	 WebElement first = driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/homeCategoryLayout"));
	 horizontalscroll(first,2,200);
	 String text = InputData.val1;
	 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text +"\"));")).click();
	 Assert.assertEquals(text,driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text +"\"));")).getText());
		
			
			
			
			 WebElement second = driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/ivCategoryBanner"));	
			 vericalscroll(second,0.1);
			 String text_2 = InputData.val2;
			
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text_2 +"\"));")).click();
				
			Assert.assertEquals(text_2,driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text_2 +"\"));")).getText());
				
				   
				WebElement third = driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/layout"));	
				vericalscroll(third,0.1);
					driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnPlus")).click();
					driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart")).click();
					
					
		
	 Thread.sleep(5000);
	}
	
	public void dropdown_class(String target) {
		
		  // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Mattress Bedroom\"));")).click();
	while(!driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + target +"\"));")).isEnabled()) {
		
		WebElement  temp  = driver.findElement(By.className("android.widget.ListView"));
		vericalscroll(temp,0.1);
	}
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + target +"\"));")).click();

	}
	
	
	
	@Test
	public void Test_Demo_2() throws InterruptedException, IOException{
		InputData.Test_Demo_2();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(AppiumBy.className("android.widget.Button")).click();
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/menu_cart")).click();
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")).click();
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")).click();
		String FName = InputData.val3;
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName")).sendKeys(FName);
		Assert.assertEquals(FName,driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName")).getText());
		String LName = InputData.val4;
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName")).sendKeys(LName);
		String Email = InputData.val5;
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail")).sendKeys(Email);
		Assert.assertEquals(Email,driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail")).getText());
		
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")).click();
		String country = InputData.val6;
		dropdown_class(country);
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/stateSpinner")).click();
		String district = InputData.val7;
		dropdown_class(district);
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")).sendKeys("Company");
		String city = InputData.val8;
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etCity")).sendKeys(city);
		String address = InputData.val9;
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")).sendKeys(address);
		
		
		WebElement temp = driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/rootScrollViewBillingAddress"));
		
		
		vericalscroll(temp,0.1);
		
		String zipcode = InputData.val10;
	driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode")).sendKeys(zipcode);
	    String phone = InputData.val11;
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone")).sendKeys(phone);
		Assert.assertEquals(phone,driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/etPhone")).getText());
		
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();
		
		String Shipping = InputData.val12;
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + Shipping +"\"));")).click();
		WebElement  temp_2  = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/radioGridGroup"));
		vericalscroll(temp_2,0.4);
		//driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		
		
		
		String payment_method = InputData.val13;
		while(!driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + payment_method +"\"));")).isEnabled()) {
			WebElement  temp_3  = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/layoutFrame"));
			vericalscroll(temp_3,0.4);
		}
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + payment_method +"\"));")).click();
		Assert.assertEquals(payment_method,driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + payment_method +"\"));")).getText());
		
		WebElement  temp_4  = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/layoutFrame"));
		vericalscroll(temp_4,0.4);
		
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + "CONFIRM" +"\"));")).click();
		
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + "CONFIRM" +"\"));")).click();
		driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();
		//com.nopstation.nopcommerce.nopstationcart:id/btnContinue
	String getText = 	driver.findElement(AppiumBy.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message")).getText();
	Boolean val = getText.contains("Your order has been successfully processed!");
	Assert.assertEquals(val,true);
		
		
		Thread.sleep(5000);
	}
	
}
