package laegeforeningen_flutter_automation_Pages_Implementation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import laegeforeningen_flutter_automation_Pages_Interface.Ugeskriftet_Interface;
import laegeforeningen_flutter_automation_Pages_ObjectRepository.HomePage_OR;
import laegeforeningen_flutter_automation_Pages_ObjectRepository.Radgivning_OR;
import laegeforeningen_flutter_automation_Pages_ObjectRepository.Ugeskriftet_OR;
import laegeforeningen_flutter_automation_library.Operations;

public class Ugeskriftet_Implementation implements Ugeskriftet_Interface {

	public void guiVerification(AndroidDriver<MobileElement> driver) {
		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(HomePage_OR.Locator.heijmHeader)));
        Operations.click(Ugeskriftet_OR.Locator.Ugeskriftet_tab, driver);
        Operations.matchAttribute(Ugeskriftet_OR.Locator.UgeskriftetHeader, Ugeskriftet_OR.UIElementConstant.UgeskriftetHeaderText,"content-desc",driver);

        //Operations.matchAttribute(Ugeskriftet_OR.Locator.Ugeskriftet_tab, Ugeskriftet_OR.UIElementConstant.Ugeskriftet_tabText, "content-desc", driver);
        
		
	}
	

}
