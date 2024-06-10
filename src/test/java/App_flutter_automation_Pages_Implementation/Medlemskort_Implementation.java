package laegeforeningen_flutter_automation_Pages_Implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import laegeforeningen_flutter_automation_Pages_Interface.Medlemskort_Interface;
import laegeforeningen_flutter_automation_Pages_ObjectRepository.HomePage_OR;
import laegeforeningen_flutter_automation_Pages_ObjectRepository.Medlemskort_OR;
import laegeforeningen_flutter_automation_library.Operations;

public class Medlemskort_Implementation implements Medlemskort_Interface {

	
	public  void guiVerification(AndroidDriver<MobileElement> driver){
		 
        driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(HomePage_OR.Locator.heijmHeader)));
        Operations.click(Medlemskort_OR.Locator.Medlemskort_tab, driver);
        Operations.matchAttribute(Medlemskort_OR.Locator.MedlemskortHeader, Medlemskort_OR.UIElementConstant.MedlemskortHeaderText,"content-desc",driver);

       // Operations.matchAttribute(Medlemskort_OR.Locator.Medlemskort_tab, Medlemskort_OR.UIElementConstant.Medlemskort_tabText, "content-desc", driver);
        
        

	    }
}
