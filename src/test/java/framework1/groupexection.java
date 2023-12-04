package framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class groupexection {
	
	@Test
	public void facebook() {
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.facebook.com/");
	}
	
	@Test(groups="food")
	
	public void zomato() {
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.zomato.com/");
	}

    @Test(groups="food")
	
	public void swiggy() {
		WebDriver d1=new ChromeDriver();
		d1.get("https://www.swiggy.com/");
	}
}
