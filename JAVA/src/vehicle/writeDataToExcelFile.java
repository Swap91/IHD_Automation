package vehicle;
 
import java.io.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 
public class writeDataToExcelFile{
 
 public static void main(String[] args) throws IOException { 
 
 
  FileInputStream file = new FileInputStream(new File("C:\\Users\\swapnil.borade\\Desktop\\testdata.xlsx")); 
  @SuppressWarnings("resource")
XSSFWorkbook workbook = new XSSFWorkbook(file);
 
  XSSFSheet sheet = workbook.getSheetAt(0);
   
  Cell searchText3 = sheet.getRow(0).getCell(0);
  searchText3.setCellValue("Test Search Keyword");
 
  file.close();
 
  FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\swapnil.borade\\Desktop\\testdata.xlsx"));
  workbook.write(outFile);
  outFile.close();
 
   }
 }