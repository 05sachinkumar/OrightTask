package baselibrary;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

import excelutility.Excelutility;

public class BaseLibrary implements Excelutility
{
		public static WebDriver driver;
		public void getLaunchUrl(String url)
		{
			String path = "C:\\Users\\sachi\\eclipse-workspace\\OrightTask\\drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver",path);
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
		
		}
		@AfterTest
		public void Teardown()
		{
//			driver.quit();
		}
		@Override
		public String getReaddata(String path, int sheetno, int colno, int rowno)
		{
			String value="";
			try {
				FileInputStream file = new FileInputStream(path);
				XSSFWorkbook wb = new XSSFWorkbook(file);
				XSSFSheet sheet = wb.getSheetAt(sheetno);
				value = sheet.getRow(rowno).getCell(colno).getStringCellValue();
			}
			catch(Exception e)
			{
				System.out.println("Error in reading file"+e);
			}
			return value;
		}
}

