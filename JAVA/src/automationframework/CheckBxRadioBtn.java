package automationframework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

	public class CheckBxRadioBtn {

	
	public static void main(String[] args) throws InterruptedException {
			// Create a new instance of the FireFox driver
			WebDriver driver = new FirefoxDriver();
			
			// Put an Implicit wait, 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// Launch the URL
			driver.get("http://www.toolsqa.com/automation-practice-form");
			driver.manage().window().maximize();
			
			List<WebElement>links=driver.findElements(By.tagName("a"));
			
			int NoofLinks=links.size();
			
			System.out.println("No OF LINK=" +NoofLinks);
			
					
			// Step 3 : Select the deselected Radio button (female) for category Sex (Use IsSelected method)
			// Storing all the elements under category 'Sex' in the list of WebLements	
			List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
			
			// Create a boolean variable which will hold the value (True/False)
			boolean bValue = false;
			
			// This statement will return True, in case of first Radio button is selected
			bValue = rdBtn_Sex.get(0).isSelected();
			
			// This will check that if the bValue is True means if the first radio button is selected
			if(bValue == false){
				// This will select Second radio button, if the first radio button is selected by default
				rdBtn_Sex.get(1).click();
			}else{
				// If the first radio button is not selected by default, the first will be selected
				rdBtn_Sex.get(0).click();
			}
			
			Thread.sleep(3000);
			
			//Step 4: Select the Third radio button for category 'Years of Exp' (Use Id attribute to select Radio button)
			List<WebElement> rdBtn_Exp = driver.findElements(By.name("exp"));
			int iRadio=rdBtn_Exp.size();
			System.out.println("============Experiance Radio BT=============");	
			System.out.println(iRadio);
			
			for(int i=0; i<iRadio; i++){
				
				String sValue = rdBtn_Exp.get(i).getAttribute("id");
				
				if(sValue.equals("exp-0"))
				{
					
					driver.findElement(By.id(sValue)).click();
					Thread.sleep(3000);
				}
				if(sValue.equals("exp-1"))
				{
					
					driver.findElement(By.id(sValue)).click();
					Thread.sleep(3000);
				}
				if(sValue.equals("exp-2"))
				{
					
					driver.findElement(By.id(sValue)).click();
					Thread.sleep(3000);
				}
				if(sValue.equals("exp-3"))
				{
					
					driver.findElement(By.id(sValue)).click();
					Thread.sleep(3000);
				}
				if(sValue.equals("exp-4"))
				{
					
					driver.findElement(By.id(sValue)).click();
					Thread.sleep(3000);
				}
				if(sValue.equals("exp-5"))
				{
					
					driver.findElement(By.id(sValue)).click();
					Thread.sleep(3000);
				}
				if(sValue.equals("exp-6"))
				{
					
					driver.findElement(By.id(sValue)).click();
					Thread.sleep(3000);
				}	
				
			}
			
			List<WebElement> Tool=driver.findElements(By.name("tool"));
			 int iTool= Tool.size();
            
			 System.out.println("============Tools=============");			 
			 System.out.println(iTool);
			 
			 for(int i=0;i<iTool;i++){
				 
				 String sValue = Tool.get(i).getAttribute("id");
				 
					if(sValue.equals("tool-0"))
					{
						
						driver.findElement(By.id(sValue)).click();
						Thread.sleep(3000);
					}	
					if(sValue.equals("tool-1"))
					{
						
						driver.findElement(By.id(sValue)).click();
						Thread.sleep(3000);
					}	
					if(sValue.equals("tool-2"))
					{
						
						driver.findElement(By.id(sValue)).click();
						Thread.sleep(3000);
					}	
				 
			 }
			 
			 Select continent_Drpdown=new Select(driver.findElement(By.name("continents")));
			 List<WebElement> getlist=continent_Drpdown.getOptions();
			 int icontinent= getlist.size();
			 System.out.println("===========continents DropDown==============");
			 System.out.println(icontinent);
			 
			 for(int i=0; i<icontinent; i++){
				  
				 String abc=continent_Drpdown.getOptions().get(i).getText();
				 System.out.println("===================================");
				 System.out.println(abc);
				 System.out.println("===================================");
				
                 driver.findElement(By.xpath("//select/option[text()='" + abc + "']")).click();
                 Thread.sleep(3000);
			 }
			 
			// STep 5: Check the Check Box 'Automation Tester' for category 'Profession'( Use Value attribute to match the selection)
			// Find the Check Box or radio button element by Name
			List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
			
			// This will tell you the number of Check Boxes are present
			int iSize = chkBx_Profession.size();
			System.out.println("================Profession=====================");
			System.out.println(iSize);
			
			// Start the loop from first Check Box to last Check Box
			for(int i=0; i < iSize ; i++ ){
				// Store the Check Box name to the string variable, using 'Value' attribute
				String sValue = chkBx_Profession.get(i).getAttribute("value");
				
				// Select the Check Box it the value of the Check Box is same what you are looking for
				if (sValue.equalsIgnoreCase("Manual Tester")){
					chkBx_Profession.get(i).click();
					Thread.sleep(3000);
				// This will take the execution out of for loop
				break;
				}
			}
			// Kill the browser
			driver.quit();

		}

}