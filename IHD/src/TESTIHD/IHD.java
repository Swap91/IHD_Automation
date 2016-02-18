package TESTIHD;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

 

public class IHD {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	 FirefoxDriver wd = new FirefoxDriver();	
		
	 wd.get("https://noc.dtitsupport247.net/login.asp");	
	 
	 String handle= wd.getWindowHandle();
	 System.out.println(handle);
	 
	 wd.findElement(By.id("txtUser")).click();
	 wd.findElement(By.id("txtUser")).sendKeys("user_helpdesk");
	 wd.findElement(By.id("txtPassword")).sendKeys("Desk@11cont15");
	 wd.findElement(By.id("Submit")).click();
	 Thread.sleep(3000);
	 
	 
	 wd.switchTo().frame("AgentLeft");
	 wd.findElement(By.xpath("//span[text()='Integrated SD']")).click();
	 Thread.sleep(500);
	 String winHandlebefore = wd.getWindowHandle();
	 System.out.println(winHandlebefore);
	 wd.findElement(By.xpath("//a[text()='Launch IHD']")).click();
	 Thread.sleep(4000);
	 wd.switchTo().defaultContent();
	 
	 for(String winHandle : wd.getWindowHandles()){
		    wd.switchTo().window(winHandle);
		}
	 
	 wd.findElement(By.xpath("//input[@name='callerFirstName']")) .click();
	 WebElement webElement = wd.findElementByXPath("//input[@name='callerFirstName']");
	 
	 webElement.sendKeys(Keys.TAB);
	 
	 
     wd.close();
   }
	
}	

