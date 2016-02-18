package automationframework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class bypassproxy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxProfile xyz=(new ProfilesIni()).getProfile("default");
		WebDriver wd=new FirefoxDriver(xyz);
		wd.get("http://newtours.demoaut.com/");
		wd.manage().window().maximize();
		List<WebElement>links=wd.findElements(By.tagName("a"));
		//here "a" is a anchor path of the links on this page, just to identify all the links.
		int no=links.size();
		
		String[] title=new String[no];
		int i=0;
		
		for (WebElement Temp_title:links)
		{
			title[i]=Temp_title.getText();
			i=i+1;
		}
		
		for (int k=0; k<title.length; k++)
		{
			wd.findElement(By.linkText(title[k])).click();
			Thread.sleep(2000);
						
			String PageTitle="Under Construction: Mercury Tours";
			
			if (wd.getTitle().equals(PageTitle))
			{
				System.out.println(title[k]+ "Page is under construction");
			}
			else
			{			
				System.out.println((title[k]+ "Page has constructed"));
			}
			Thread.sleep(2000);
			System.out.println("====================");
			wd.navigate().back();
		}
		
		}
}
