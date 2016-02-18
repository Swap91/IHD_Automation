package TESTIHD;
 
import org.openqa.selenium.*;
 
public class NocPortalPage {
 
        private static WebElement element = null;
 
    public static WebElement MainHeaderOption(WebDriver driver){
 
         element = driver.findElement(By.xpath("//*[@id='dm0m0i1tdT']/div[contains(text(),'Management')]"));
 
         return element;
 
         }
 
     public static WebElement MainMenuOption(WebDriver driver){
 
         element = driver.findElement(By.xpath(".//*[@id='dm0m5i11tdT']"));
 
         return element;
 
         }
     
     public static WebElement SubMenuOption(WebDriver driver){
        	 
             element = driver.findElement(By.xpath("//*[@id='dm0m12i0tdT']"));
     
             return element;
         }
   
     
}