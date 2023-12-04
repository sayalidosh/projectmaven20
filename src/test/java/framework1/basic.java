/**
 * 
 */
package framework1;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 */
public class basic {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		final WebDriver d1;
		FileInputStream fis=new FileInputStream("src\\test\\resources\\data.properties.txt");
		Properties Pfile=new Properties();
		Pfile.load(fis);
		//to read data from file
				String BROWSER = Pfile.getProperty("browser");
				String URL = Pfile.getProperty("url");
				String USERNAME = Pfile.getProperty("un");
				String PWD = Pfile.getProperty("password");
				
				 if(BROWSER.equals("Chrome"))
			      {
			    	d1=new ChromeDriver();  
			      }
			      else if (BROWSER.equals("firefox"))
			      {
			    	  d1=new FirefoxDriver();
			      }
			      else
			      {
			    	  
			    	  d1=new EdgeDriver();
			      }
				 d1.get(URL);
			      //maximize window
				 d1.manage().window().maximize();
			      //to apply implicit wait
				 d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			     	//launch the url    
			      
			       //login to application
			       d1.findElement(By.name("user_name")).sendKeys(USERNAME);
				   d1.findElement(By.name("user_password")).sendKeys(PWD);
				   d1.findElement(By.id("submitButton")).click();
				
				
				
		 
	}

}
