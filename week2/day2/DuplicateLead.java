package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver dr=new ChromeDriver();
        dr.get("http://leaftaps.com/opentaps/control/main");
        dr.manage().window().maximize();
        dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        dr.findElement(By.id("username")).sendKeys("demoSalesManager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		dr.findElement(By.linkText("CRM/SFA")).click();
		dr.findElement(By.linkText("Leads")).click();
		dr.findElement(By.linkText("Find Leads")).click();
		dr.findElement(By.xpath("//span[text()='Email']")).click();
		dr.findElement(By.xpath("//div/input[@name='emailAddress']")).sendKeys("learning@testleaf.com");
		dr.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		dr.findElement(By.xpath("(//a[text()='Karthik'])[1]")).click();
		dr.findElement(By.linkText("Duplicate Lead")).click();
		String tt=dr.getTitle();
		System.out.println(tt);
		dr.findElement(By.name("submitButton")).click();
		dr.close();
	}

}
