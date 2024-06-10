package laegeforeningen_flutter_automation_Pages_Implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import laegeforeningen_flutter_automation_Pages_Interface.RabetterPage_Interface;
import laegeforeningen_flutter_automation_Pages_ObjectRepository.HomePage_OR;
import laegeforeningen_flutter_automation_Pages_ObjectRepository.RabatterPage_OR;
import laegeforeningen_flutter_automation_library.Operations;

public class Rabetter_Implemantation implements RabetterPage_Interface{
	
	public  void guiVerification(AndroidDriver<MobileElement> driver){
		 
        driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(HomePage_OR.Locator.heijmHeader)));
        Operations.click(RabatterPage_OR.Locator.rabatter_tab, driver);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(RabatterPage_OR.Locator.RabatterHeader)));
        Operations.matchAttribute(RabatterPage_OR.Locator.RabatterHeader, RabatterPage_OR.UIElementConstant.RabatterHeaderText,"content-desc",driver);
        Operations.matchAttribute(RabatterPage_OR.Locator.Details, RabatterPage_OR.UIElementConstant.DetailsText,"content-desc",driver);
        Operations.matchAttribute(HomePage_OR.Locator.Hjem_tab,HomePage_OR.UIElementConstant.Hjem_tabText, "content-desc", driver);
        Operations.matchAttribute(RabatterPage_OR.Locator.HoldFest, RabatterPage_OR.UIElementConstant.HoldFestText,"content-desc",driver);
        Operations.matchAttribute(RabatterPage_OR.Locator.Transport, RabatterPage_OR.UIElementConstant.TransportText,"content-desc",driver);
        
        Operations.matchAttribute(RabatterPage_OR.Locator.Bøger, RabatterPage_OR.UIElementConstant.BøgerText,"content-desc",driver);
        
        Operations.matchAttribute(RabatterPage_OR.Locator.Koncerter, RabatterPage_OR.UIElementConstant.KoncerterText,"content-desc",driver);
        
        Operations.matchAttribute(RabatterPage_OR.Locator.Sommerhuse, RabatterPage_OR.UIElementConstant.SommerhuseText,"content-desc",driver);
        Operations.matchAttribute(RabatterPage_OR.Locator.Bolig, RabatterPage_OR.UIElementConstant.BoligText,"content-desc",driver);
        Operations.matchAttribute(RabatterPage_OR.Locator.Forsikring, RabatterPage_OR.UIElementConstant.ForsikringText,"content-desc",driver);
        //Operations.matchAttribute(RabatterPage_OR.Locator.rabatter_tab, RabatterPage_OR.UIElementConstant.rabatter_tabText,"content-desc",driver);
        
        
        
        

	    }

}
