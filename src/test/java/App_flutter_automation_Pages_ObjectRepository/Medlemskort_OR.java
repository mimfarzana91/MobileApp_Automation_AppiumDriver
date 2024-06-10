package laegeforeningen_flutter_automation_Pages_ObjectRepository;

import org.openqa.selenium.By;

public class Medlemskort_OR {
	 public static class Locator{

         
         public static By MedlemskortHeader = By.xpath("//android.view.View[@content-desc=\"Medlemskort\"]");

         public static By Medlemskort_tab=By.xpath("//android.widget.ImageView[@index=3]");

        
         

    }
    

    public static class UIElementConstant{

         public static String MedlemskortHeaderText = "Medlemskort";
        public static String  Medlemskort_tabText="Medlemskort Tab 3 of 5";
    
    
    }

	
	
	
}
