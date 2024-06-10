package laegeforeningen_flutter_automation_Pages_TestCases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import laegeforeningen_flutter_automation_Pages_Implementation.Radgivning_Implementation;
import laegeforeningen_flutter_automation_library.BaseConfiguration;

@Listeners(laegeforeningen_flutter_automation_listener.CustomListener.class)

public class Radgivning_TestCase extends BaseConfiguration{
	
	Radgivning_Implementation radgivning=new Radgivning_Implementation();

	/*@BeforeClass
    public void setupDriver() throws MalformedURLException{
       
		setup();
    }*/


    @Test(priority = 1)
    public void uiElementVerification(){
    	radgivning.guiVerification(driver);
    	
    }
    
    
   /* @AfterTest
    public void  testCaseTearDown() {
       tearDown();
    	
    }*/

}
