/**
 * 
 */
package framework1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * 
 */
public class basicexcel {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws EncryptedDocumentException 
	 */
	@Test
	
	public void mod1()throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		final WebDriver d1;
		
		 FileInputStream fil=new FileInputStream("src\\test\\resources\\excel1.xlsx");
		
					
		  Workbook wb = WorkbookFactory.create(fil);
		  Sheet sh = wb.getSheet("sheet1");
		 Row rw = sh.getRow(1);
		Cell c1 = rw.getCell(1);
		String BROWSER=c1.getStringCellValue();
		System.out.println(BROWSER);
		
		
//	    Row rw1 = sh.getRow(1);
//		Cell c2 = rw1.getCell(1);
//		String URL=c2.getStringCellValue();
//					
//					
//					 if(BROWSER.equals("Chrome"))
//				      {
//				    	d1=new ChromeDriver();  
//				      }
//				      else if (BROWSER.equals("firefox"))
//				      {
//				    	  d1=new FirefoxDriver();
//				      }
//				      else
//				      {
//				    	  
//				    	  d1=new EdgeDriver();
//				      }
//					 d1.get(URL);
//				      //maximize window
//					 d1.manage().window().maximize();
//				      //to apply implicit wait
//					 d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//				     	//launch the url    
//					
//					 Row rw2 = sh.getRow(2);
//						Cell c3 = rw2.getCell(1);
//						String USERNAME=c3.getStringCellValue();
//						
//						Row rw3 = sh.getRow(3);
//						Cell c4 = rw3.getCell(1);
//						String PWD=c4.getStringCellValue();
//		
//		 d1.findElement(By.name("user_name")).sendKeys(USERNAME);
//		   d1.findElement(By.name("user_password")).sendKeys(PWD);
//		   d1.findElement(By.id("submitButton")).click();
		  
	}

}
