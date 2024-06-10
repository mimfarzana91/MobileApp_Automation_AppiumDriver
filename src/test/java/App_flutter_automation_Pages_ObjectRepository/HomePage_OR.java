package laegeforeningen_flutter_automation_Pages_ObjectRepository;

import org.openqa.selenium.By;

public class HomePage_OR {
	
	   public static class Locator{

	         
	          public static By heijmHeader = By.xpath("//android.view.View[@content-desc=\"Hjem\"]");

	          public static By Hjem_tab=By.xpath("//android.widget.ImageView[contains(@content-desc,'Hjem Tab 1 of 5')and(@index=1)]");
	          

	          public static By settings = By.xpath("//android.widget.ImageView[@index=1]");

	          

	     }
	     

	     public static class UIElementConstant{

	          public static String heijmHeaderText = "Hjem";
	         public static String  Hjem_tabText="Hjem Tab 1 of 5";
	     
	     
	     }

}
