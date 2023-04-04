package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
		WebElement password=driver.findElement(By.id("password"));
	    password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		String str=driver.getTitle();
		System.out.println(str);
		Thread.sleep(3000);
		driver.close();
}
}