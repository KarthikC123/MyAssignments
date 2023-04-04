package week2.seleniumsetup;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumSample {
	
	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

}
