package automationframework;

import java.io.FileInputStream;
import java.io.FileOutputStream;





import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class POIExample
{
	public static void main(String[] args) throws Exception
	{
		//FirefoxProfile f=(new ProfilesIni()).getProfile("default");

		WebDriver wd=new FirefoxDriver();   

		FileInputStream fi=new FileInputStream("C:\\Users\\swapnil.borade\\Desktop\\testdata.xlsx");

	
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(fi);

		Sheet s=wb.getSheet("Sheet1");
        
		int a=s.getLastRowNum();
		System.out.println("================================================");
        System.out.println("No of Validation:" +a);
        System.out.println("================================================");
        
		wd.get("https://control.itsupport247.net/index.asp"); //launching
		
	    for(int i=1;i<=a;i++)
		{
			int j=0;
			String Username=s.getRow(i).getCell(j).getStringCellValue();
			String Password=s.getRow(i).getCell(j+1).getStringCellValue();
		
			wd.findElement(By.id("user_txt")).sendKeys(Username); //log-in
			wd.findElement(By.id("user_pass")).sendKeys(Password);
			System.out.println(Username);
			System.out.println(Password);
			wd.findElement(By.id("Submit")).click();
			Thread.sleep(4000);
			
			Boolean isPresent = wd.findElements(By.id("dashboardPage")).size()!=0;
			
			String Data= wd.findElement(By.id("dashboardPage")).getText();
			System.out.println(Data);
			
			System.out.println(isPresent);
			
		if(isPresent==true)
				{
				wd.findElement(By.xpath("//html/body/header/div/div/div/div[1]/div/nav/ul/li[2]/a/i")).click();
				wd.findElement(By.linkText("Logout")).click();
			    Thread.sleep(2000);
				s.getRow(i).createCell(j+2).setCellValue("Passed");
				s.getRow(i).createCell(j+3).setCellValue(Data);
				System.out.println("Login Succssfully");
				System.out.println("========================================");
				}
			else
			    {
				wd.get("https://control.itsupport247.net/index.asp");
				s.getRow(i).createCell(j+2).setCellValue("Failed");
			    System.out.println("Login Failed");
			    System.out.println("=========================================");
			    
			    }
	
		}
		FileOutputStream O=new FileOutputStream("C:\\Users\\swapnil.borade\\Desktop\\testdata.xlsx");
		wb.write(O);
		wd.quit();
	}

}
