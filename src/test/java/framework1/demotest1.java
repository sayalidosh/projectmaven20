package framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demotest1 {
@Test
public void facebookTest() {
	
	WebDriver d1=new ChromeDriver();
	d1.get("https://www.facebook.com/");
	String Actualtitle=d1.getTitle();
	System.out.println(Actualtitle);
}
}
