package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		ChromeDriver drv=new ChromeDriver();
		drv.get("http://leaftaps.com/opentaps");
		drv.manage().window().maximize();
		WebElement username=drv.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("demoSalesManager");
		WebElement pwd=drv.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("crmsfa");
		drv.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		drv.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		drv.findElement(By.xpath("//a[text()='Leads']")).click();
		drv.findElement(By.xpath("//div/a[@class='linktext']"));
	}

}
