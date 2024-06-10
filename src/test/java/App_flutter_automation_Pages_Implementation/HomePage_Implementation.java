package laegeforeningen_flutter_automation_Pages_Implementation;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import laegeforeningen_flutter_automation_Pages_Interface.HomePage_Interface;
import laegeforeningen_flutter_automation_Pages_ObjectRepository.HomePage_OR;
import laegeforeningen_flutter_automation_library.Operations;


public class HomePage_Implementation implements HomePage_Interface {
	 public  void guiVerification(AndroidDriver<MobileElement> driver){
		 
         driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
         WebDriverWait wait = new WebDriverWait(driver,5);
         wait.until(ExpectedConditions.visibilityOf(driver.findElement(HomePage_OR.Locator.heijmHeader)));
         Operations.matchAttribute(HomePage_OR.Locator.heijmHeader, HomePage_OR.UIElementConstant.heijmHeaderText,"content-desc",driver);
         Operations.verifyElementIsPresent(HomePage_OR.Locator.settings, driver);
         //Operations.matchAttribute(HomePage_OR.Locator.Hjem_tab,HomePage_OR.UIElementConstant.Hjem_tabText, "content-desc", driver);
         
         

	    }

}
