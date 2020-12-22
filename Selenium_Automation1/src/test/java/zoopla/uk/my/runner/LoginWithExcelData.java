package zoopla.uk.my.runner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class LoginWithExcelData {
	String locationOfData = "./TestData/Book.xlsx";
	@Test
	public void PassingDataFromExcel() throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.zoopla.co.uk/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='cookie-consent-form']/div/div/div/button[2]")).click();
	driver.findElement(By.linkText("Sign in")).click();
	
	ArrayList<String>userName = readExcelData(0);
	ArrayList<String>passWord = readExcelData(0);
	for(int i =0; i<userName.size();i++) {
		
	
	driver.findElement(By.id("signin_email")).sendKeys("masudrana031980@gmail.com");
	driver.findElement(By.id("signin_password")).sendKeys("19959798");
	driver.findElement(By.id("signin_submit")).click();
	//driver.quit();
	}}
    public ArrayList<String>readExcelData(int clo) throws IOException {
    	FileInputStream file =new FileInputStream(locationOfData);
		XSSFWorkbook workbook =new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		Iterator<Row> roeiterator =sheet.iterator();
		roeiterator.next();
		ArrayList<String>list =new ArrayList<>();
		while (roeiterator.hasNext()) {
			list.add(roeiterator.next().getCell(clo).getStringCellValue());
		}
		System.out.println(" List of data :  " + list);
    	return list;
    	
    }
}
