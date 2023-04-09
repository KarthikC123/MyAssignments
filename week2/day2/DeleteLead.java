package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		dr.findElement(By.xpath("//span[text()='Phone']")).click();
		dr.findElement(By.xpath("//div/input[@name='phoneCountryCode']")).clear();
		dr.findElement(By.xpath("//div/input[@name='phoneCountryCode']")).sendKeys("+91");
		dr.findElement(By.xpath("//div/input[@name='phoneNumber']")).sendKeys("7356226032");
		dr.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		//there is no phone number details in leads to search so using Name and ID option
		dr.findElement(By.xpath("//span[text()='Name and ID']")).click();
		dr.findElement(By.xpath("//input[@name='id']")).sendKeys("11255");
		dr.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		dr.findElement(By.linkText("11255")).click();
		dr.findElement(By.linkText("Delete")).click();
		dr.findElement(By.linkText("Find Leads")).click();
		dr.findElement(By.xpath("//input[@name='id']")).sendKeys("11255");
		dr.findElement(By.xpath("//em/button[text()='Find Leads']")).click();		
		dr.close();
	}

}
