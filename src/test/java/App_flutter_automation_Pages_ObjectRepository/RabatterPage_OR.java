package laegeforeningen_flutter_automation_Pages_ObjectRepository;

import org.openqa.selenium.By;

public class RabatterPage_OR {

	
	 public static class Locator{

         
         public static By RabatterHeader = By.xpath("//android.view.View[@content-desc=\"Medlemsrabatter\"]");

         public static By rabatter_tab= By.xpath("//android.widget.ImageView[@index=2]");
         public static By Details = By.xpath("//android.view.View[@content-desc=\"Som medlem af Lægeforeningen kan du få rabat på udvalgte koncerter, forestillinger og forlystelser.\"]");
         public static By Transport = By.xpath("//android.widget.ImageView[@content-desc=\"Transport & akuttaske\"]");
         public static By Bøger = By.xpath("//android.widget.ImageView[@content-desc=\"Bøger, abonnementer & Forbrugsforeningen\"]");
         public static By Koncerter = By.xpath("//android.widget.ImageView[@content-desc=\"Koncerter, forestillinger & forlystelser\"]");
         public static By Sommerhuse = By.xpath("//android.widget.ImageView[@content-desc=\"Sommerhuse, ferieboliger & hotelle\"]");
         public static By Bolig = By.xpath("//android.widget.ImageView[@content-desc=\"Bolig, delikatesser & foto\"]");
         public static By Forsikring = By.xpath("//android.widget.ImageView[@content-desc=\"Forsikring, bank, pension & boligadvokat\"]");
         public static By HoldFest = By.xpath("//android.widget.ImageView[@content-desc=\"Hold fest i Domus Medica\"]");

         

    }
    

    public static class UIElementConstant{

         public static String RabatterHeaderText = "Medlemsrabatter";
        public static String  rabatter_tabText="Rabatter Tab 2 of 5";
        public static String DetailsText="Som medlem af Lægeforeningen kan du få rabat på udvalgte koncerter, forestillinger og forlystelser.";
        public static String TransportText ="Transport & akuttaske";
        public static String BøgerText = "Bøger, abonnementer & Forbrugsforeningen";
        public static String KoncerterText = "Koncerter, forestillinger & forlystelser";
        public static String SommerhuseText = "Sommerhuse, ferieboliger & hotelle";
        public static String BoligText = "Bolig, delikatesser & foto";
        public static String ForsikringText = "Forsikring, bank, pension & boligadvokat";
        public static String HoldFestText="Hold fest i Domus Medica";
    
    }

}
