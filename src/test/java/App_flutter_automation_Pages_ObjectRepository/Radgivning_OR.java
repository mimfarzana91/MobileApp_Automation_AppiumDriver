package laegeforeningen_flutter_automation_Pages_ObjectRepository;

import org.openqa.selenium.By;

public class Radgivning_OR {

	
 public static class Locator{

         
         public static By  RadgivninHeader = By.xpath("//android.view.View[@content-desc=\"Rådgivning\"]");

         public static By  Radgivnin_tab=By.xpath("//android.widget.ImageView[@index=4]");

        
         

    }
    

    public static class UIElementConstant{

         public static String  RadgivnintHeaderText = "Rådgivning";
        public static String  Radgivnin_tabText="Rådgivning Tab 4 of 5";
    
    
    }
}
