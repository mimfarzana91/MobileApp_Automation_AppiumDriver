package laegeforeningen_flutter_automation_Pages_ObjectRepository;

import org.openqa.selenium.By;

public class Ugeskriftet_OR {
	
	public static class Locator{

        
        public static By  UgeskriftetHeader = By.xpath("//android.view.View[@content-desc=\"Ugeskriftet\"]");

        public static By  Ugeskriftet_tab=By.xpath("//android.widget.ImageView[@index=5]");

       
        

   }
   

   public static class UIElementConstant{

        public static String  UgeskriftetHeaderText = "Ugeskriftet";
       public static String  Ugeskriftet_tabText="Ugeskriftet Tab 5 of 5";
   
   
   }

}
