package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumWebDriver {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		EdgeDriver edg=new EdgeDriver();
		driver.get("https://www.facebook.com/login");
		edg.get("http://leaftaps.com/opentaps/control/main");
	}
}

