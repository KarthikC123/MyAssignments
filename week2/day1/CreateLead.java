package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/login");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement usr=dr.findElement(By.id("username"));
		usr.sendKeys("demoSalesManager");
		WebElement pwd=dr.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		dr.findElement(By.linkText("CRM/SFA")).click();
		dr.findElement(By.linkText("Leads")).click();
		dr.findElement(By.linkText("Create Lead")).click();
		WebElement cn=dr.findElement(By.id("createLeadForm_companyName"));
		cn.sendKeys("TestLeaf");
		WebElement fn=dr.findElement(By.id("createLeadForm_firstName"));
		fn.sendKeys("Karthik");
		WebElement ln=dr.findElement(By.id("createLeadForm_lastName"));
		ln.sendKeys("C");
		WebElement fnl=dr.findElement(By.id("createLeadForm_firstNameLocal"));
		fnl.sendKeys("Karthick");
		WebElement dep=dr.findElement(By.id("createLeadForm_departmentName"));
		dep.sendKeys("Testing");
		WebElement des=dr.findElement(By.id("createLeadForm_description"));
		des.sendKeys("Creating Lead to learn Selenium");
		WebElement em=dr.findElement(By.id("createLeadForm_primaryEmail"));
		em.sendKeys("learning@testleaf.com");
		WebElement cnt=dr.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd=new Select(cnt);
		dd.selectByVisibleText("United States");
		WebElement st=dr.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dp=new Select(st);
		dp.selectByVisibleText("New York");
		dr.findElement(By.className("smallSubmit")).click();
		String tt=dr.getTitle();
		System.out.println(tt);
	}

}
