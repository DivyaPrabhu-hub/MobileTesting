import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.set.SynchronizedSet;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.apache.commons.*;

import com.sun.java.swing.plaf.gtk.GTKConstants.Orientation;
import com.sun.jna.Platform;

import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class androidActions {
	
static AndroidDriver<WebElement>driver;

	
 	
	public static void main(String[]args) throws InterruptedException, IOException{
	 		
		DesiredCapabilities capability = new DesiredCapabilities();
		
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "R9WMB09P2HJ");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.NO_RESET, true);
		//File app = new File("//Users//divya//Documents//checklist.apk");
		//capability.setCapability("app", app.getAbsolutePath());
		
		//capability.setCapability("appPackage", "com.mobeta.android.demodslv");
		//capability.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		System.out.println("Application launched");
		
	//capability.setCapability("appPackage", "com.samsung.android.contacts");
	//capability.setCapability("appActivity", "com.samsung.android.contacts.contactslist.PeopleActivity");
		
		//capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.gallery3d");
		//capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.samsung.android.gallery.app.activity.GalleryActivity");
		
		//capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.apps.maps");
		//capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.maps.MapsActivity");
		
		//capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.sec.android.app.camera");
		//capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.sec.android.app.camera.Camera");
		
		//driver= new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capability); // %%%%%%&&&&&&&&&&&&&&$$$$$$$
		//System.out.println("Contacts app launched"); 
		
		
		//Click Action and Type keyword***************
	/*	driver.findElement(By.id("com.samsung.android.contacts:id/menu_search")).click();
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_D);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_E);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_E);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_P);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_U);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_ENTER);
		//driver.hideKeyboard(); */
		
		//System.out.println("driver.getPageSource()");
		
		//Scrolling Actions****************
		
		/*driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()"
				+ ".resourceId(\"com.samsung.android.contacts:id/contact_list\"))"
				+ ".scrollIntoView(new UiSelector().text(\"Deepu\"))").click();*/
		
		//Right and Left Swipes  = left to right**********
		
		/*TouchAction swipe = new TouchAction(driver);
		swipe.press(10, 500).waitAction(1000).moveTo(650, 500).release().perform();*/
		
		//right to left
      /*  TouchAction swipe = new TouchAction(driver);
		swipe.press(600, 500).waitAction(1000).moveTo(17, 500).release().perform();*/
		
		//MultiTouch Action and Screenshot*****************
		
		/*TouchAction tap1 =new TouchAction(driver);
		tap1.press(100, 550).moveTo(100, 1000).release();
		
		TouchAction tap2 =new TouchAction(driver);
		tap2.press(200, 550).moveTo(200, 1000).release();
		
		TouchAction tap3 =new TouchAction(driver);
		tap3.press(300, 550).moveTo(300, 1000).release();
		
		MultiTouchAction screenshot = new MultiTouchAction(driver);
		
		screenshot.add(tap1).add(tap2).add(tap3).perform();*/
		
		//pinch In Option for map  zoom in and zoom out*********************
		
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TouchAction tap1 = new TouchAction(driver);
		tap1.press(300, 200).waitAction(8000).moveTo(200, 900).release();
		
		TouchAction tap2 = new TouchAction(driver);
		tap2.press(700, 1600).waitAction(8000).moveTo(700, 1000).release();
		
		MultiTouchAction pinch = new MultiTouchAction(driver);
		pinch.add(tap1).add(tap2).perform();
		
		System.out.println("Map is launched");*/
		
		//Screenshot **************************
		
		/*File screenshot = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("//Users//divya//OneDrive//Screenshot//screenshot.png"));
				
		System.out.println("Screen shot captured");*/
		
		//Screen rotation  lock and unlock
		//driver.rotate(ScreenOrientation.LANDSCAPE);
		//driver.rotate(ScreenOrientation.PORTRAIT);
		
		//Screen rotation and  lock and unlock *************************
		
	/*	if(driver.isLocked()){
			//works with basic locks.
			driver.unlockDevice();
			System.out.println("Phone is unlocked");
		}
		driver.rotate(ScreenOrientation.LANDSCAPE);
		System.out.println("Screen rotaed to landscape");
		Thread.sleep(4000);
		driver.rotate(ScreenOrientation.PORTRAIT);
		System.out.println("Screen rotated to Potrait");
		Thread.sleep(4000);
		driver.lockDevice();
		System.out.println("Phone is locked");  */
		
		//drag and Drop************
		
		capability.setCapability("appPackage", "com.mobeta.android.demodslv");
		capability.setCapability("appActivity", "com.mobeta.android.demodslv.Launcher");
		
		driver= new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capability);
		
driver.findElement(By.className("android.widget.LinearLayout")).click();

MobileElement draggable = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Brad Mehldau']/preceding-sibling::android.widget.ImageView"));
MobileElement droppable = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Miles Davis']/preceding-sibling::android.widget.ImageView"));

TouchAction action = new TouchAction(driver);

action.press(draggable).moveTo(droppable).release().perform();

System.out.println("Drag and drop action completed");

     //Switch Application*****************
		
		/*capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.apps.maps");
		capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.google.android.maps.MapsActivity");
		System.out.println("maps application launched");
		
			driver= new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capability);
			
		driver.startActivity("com.mobeta.android.demodslv", "com.mobeta.android.demodslv.Launcher");
		System.out.println("Switched to text application");
		driver.findElement(By.className("android.widget.LinearLayout")).click();
		System.out.println("performed click operation");
		
		driver.navigate().back();
		driver.navigate().back();
		
		System.out.println("Switched back to Map application");*/
		
		//Assignment
		
		/*capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "jakiganicsystems.simplestchecklist");
		capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "jakiganicsystems.simplestchecklist.MainActivity");
		
		driver= new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"),capability); 
		
		driver.findElement(By.className("android.widget.CheckBox")).click();
		
	   MobileElement draggable = (MobileElement) driver.findElement(By.xpath("//android.widget.TextView[@text='Thank you for download!!']"
			+ "/following-sibling::android.widget.ImageView"));
		MobileElement droppable = (MobileElement) driver.findElement(By.id("jakiganicsystems.simplestchecklist:id/menu_clear_completed"));
		TouchAction action = new TouchAction(driver);

		action.press(draggable).moveTo(droppable).release().perform();

		System.out.println("Drag and drop action completed");*/
	}

}
