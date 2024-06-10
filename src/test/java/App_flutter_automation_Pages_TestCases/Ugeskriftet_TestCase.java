package laegeforeningen_flutter_automation_Pages_TestCases;

import java.net.MalformedURLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import laegeforeningen_flutter_automation_Pages_Implementation.Ugeskriftet_Implementation;
import laegeforeningen_flutter_automation_library.BaseConfiguration;

@Listeners(laegeforeningen_flutter_automation_listener.CustomListener.class)

public class Ugeskriftet_TestCase extends BaseConfiguration {

	
	Ugeskriftet_Implementation ugeskriftet=new Ugeskriftet_Implementation();
	
	/*@BeforeClass
    public void setupDriver() throws MalformedURLException{
       
		setup();
    }*/


    @Test(priority = 1)
    public void uiElementVerification(){
    	ugeskriftet.guiVerification(driver);
    	
    }
    
    
   /* @AfterTest
    public void  testCaseTearDown() {
       tearDown();
    	
    }*/
}
