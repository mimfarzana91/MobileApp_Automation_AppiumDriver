package laegeforeningen_flutter_automation_library;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseConfiguration {

	
	//public static String appPtah = "/Users/farzanamim/eclipse-workspace/App_flutter_automation/app-staging-debug.apk";
	public static String appPtah = "/app-staging-debug.apk";
    public static AndroidDriver<MobileElement> driver;
    private String testName = "Flutter Automation";
    //private String udid = "170ada0e";
    private String deviceName = "Android Emulator";

    public void setup () throws MalformedURLException {

         File rootFile = new File("");
         File appFile = new File(rootFile.getAbsolutePath() + appPtah);
         appPtah=appFile.getAbsolutePath();
      
        DesiredCapabilities flutterCapabilities = new DesiredCapabilities();
        flutterCapabilities.setCapability( "deviceName", deviceName );
        flutterCapabilities.setCapability( "platformName", "Android" );
        flutterCapabilities.setCapability("platformVersion", "7.1.1");
        flutterCapabilities.setCapability("appPackage", "dk.laegeforeningen.app.staging");// app capability

        flutterCapabilities.setCapability("appActivity", "com.example.flutter_template.MainActivity"); //app activity
        flutterCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
        flutterCapabilities.setCapability( "testName", testName );
        //flutterCapabilities.setCapability("automationName", "uiautomator2");
        //flutterCapabilities.setCapability("noReset", "true");
       // flutterCapabilities.setCapability("skipUnlock","true");
       // flutterCapabilities.setCapability("udid",udid);
        flutterCapabilities.setCapability("app",appPtah);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), flutterCapabilities);
        
    }
    public void tearDown() {
		driver.quit();
	}
    public static void takeScreenshot(String testMethodName) {
        try {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

           String currentDir = System.getProperty("user.dir") + "/build/screenshots/";
            FileUtils.copyFile(scrFile, new File(currentDir+testMethodName+".jpg"));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
