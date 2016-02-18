package TESTIHD;
 
import org.openqa.selenium.*;
 
public class NocLoginPage {
 
        private static WebElement element = null;
 
    public static WebElement txtbx_UserName(WebDriver driver){
 
         element = driver.findElement(By.id("txtUser"));
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
 
         element = driver.findElement(By.id("txtPassword"));
 
         return element;
 
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
 
         element = driver.findElement(By.id("Submit"));
 
         return element;
 
         }
 
}