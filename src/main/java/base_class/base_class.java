package base_class;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import excelutility.excelutility;
import propertyutility.property_utility;

public  class base_class implements excelutility,property_utility
{
	public static WebDriver driver;
public void getLaunch(String Url)
{
	System.setProperty("webdriver.chrome.driver",("C:\\Users\\Gadget gully\\eclipse-workspace\\15SepSelenium_Automation\\chromedriver.exe"));	
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.testingbaba.com/old");
	driver.findElement(By.xpath("//*[ text()='×']")).click();
	driver.findElement(By.xpath("//*[text()='Practice']")).click();
	
}

@Override
public String getReData(String key)
{
	String value="";
	String configpath="";
	
	try {
	FileInputStream fis=new FileInputStream(configpath);
	Properties prop=new Properties();
	prop.load(fis);
	value=prop.getProperty(key);
	
	} catch (Exception e)
	{System.out.println("issuse in getreddata :"+e);

	}
	 return value;
  
}
//public String getReadData(int sheetno, int rowno, int colno)
{
//	String path="C:\\Users\\Gadget gully\\eclipse-workspace\\15SepSelenium_Automation\\testdata\\getreaddata.xlsx";
//	String value="";
//	try {
//		FileInputStream fis=new FileInputStream(path);
//		XSSFWorkbook wb=new XSSFWorkbook(fis);
//		XSSFSheet sheet=wb.getSheetAt(sheetno);
//         value=sheet.getRow(rowno).getCell(colno).getStringCellValue();		
//	} catch (Exception e) 
//	{
//	System.out.println("issue in gatreddata :"+e);	
// 	}
 	//return value;
 	 
}

@Override
public String getReadData(String path, int sheetno, int rowno, int colno)
{
	String path1 ="C:\\Users\\Gadget gully\\eclipse-workspace\\15SepSelenium_Automation\\testdata\\getreaddata.xlsx";
	String value="";
	try {
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(sheetno);
         value=sheet.getRow(rowno).getCell(colno).getStringCellValue();		
	} catch (Exception e) 
	{
	System.out.println("issue in gatreddata :"+e);	
 	}
 	return value;
}

  

}
	 