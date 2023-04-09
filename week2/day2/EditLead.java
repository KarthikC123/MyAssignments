package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.findElement(By.id("username")).sendKeys("demoSalesManager");
		d.findElement(By.id("password")).sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.linkText("CRM/SFA")).click();
		d.findElement(By.linkText("Leads")).click();
		d.findElement(By.linkText("Find Leads")).click();
		d.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Karthik");
		d.findElement(By.xpath("//em/button[text()='Find Leads']")).click();
		d.findElement(By.xpath("(//div/a[text()='Karthik'])[1]")).click();
		String t=d.getTitle();
		System.out.println(t);
		d.findElement(By.linkText("Edit")).click();
		d.findElement(By.id("updateLeadForm_companyName")).clear();
		d.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestingLeaf");
		d.findElement(By.name("submitButton")).click();
		d.close();
	}

}
