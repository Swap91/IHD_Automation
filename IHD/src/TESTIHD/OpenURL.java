package TESTIHD;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;


public class OpenURL {

	public static void main(String args[]) throws InterruptedException{
		
		System.setProperty("webdriver.ie.driver", "");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://noc.dtitsupport247.net/login.asp");
		driver.manage().window().maximize();
		String handle= driver.getWindowHandle();
		System.out.println(handle);
		
		 NocLoginPage.txtbx_UserName(driver).click();
		 NocLoginPage.txtbx_UserName(driver).sendKeys("user_Sdm");
		 NocLoginPage.txtbx_Password(driver).sendKeys("Sdm@12345");
		 NocLoginPage.btn_LogIn(driver).click();
		 Thread.sleep(3000);
		 
		 Actions action = new Actions(driver);
		 action.sendKeys(Keys.ESCAPE).build().perform();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 NocPortalPage.MainHeaderOption(driver).click();
		 //action.moveToElement(NocPortalPage.MainHeaderOption(driver)).build().perform();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 NocPortalPage.MainMenuOption(driver).isDisplayed();
		 action.moveToElement(NocPortalPage.MainMenuOption(driver)).build().perform();
		 NocPortalPage.MainMenuOption(driver).click();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 NocPortalPage.SubMenuOption(driver).click();
		
		 Thread.sleep(3000);
		 String handle1= driver.getWindowHandle();
		 driver.switchTo().window(handle1);
	     driver.manage().window().maximize();   
		 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//h2[text()='Email to Ticketing - Manual Triage']"));
		 
	}
	
}
