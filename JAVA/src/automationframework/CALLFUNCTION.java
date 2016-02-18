package automationframework;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CALLFUNCTION extends LoginTest {
	
         static FirefoxDriver wd = new FirefoxDriver();	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 wd.get("https://control.itsupport247.net/index.asp");	
		 String handle= wd.getWindowHandle();
		 System.out.println(handle);
		 Login();
		 String Data= wd.findElement(By.id("dashboardPage")).getText();
		 System.out.println(Data);
		 Logout();
		 		
	}
		
		/* public static void Login() throws InterruptedException{ 
			 
			    wd.findElement(By.id("user_txt")).sendKeys("automation@userrole.com"); 
				wd.findElement(By.id("user_pass")).sendKeys("Abc@1234");
			    wd.findElement(By.id("Submit")).click();
				Thread.sleep(4000);
			 } 
		 
		 public static void Logout() throws InterruptedException{ 
			    wd.findElement(By.xpath("//html/body/header/div/div/div/div[1]/div/nav/ul/li[2]/a/i")).click();
				wd.findElement(By.linkText("Logout")).click();
			    Thread.sleep(2000);
	         }
		*/
	}


