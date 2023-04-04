package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	public static void main(String[] args) {
		ChromeDriver dv=new ChromeDriver();
		dv.get("http://leaftaps.com/opentaps/control/login");
		dv.manage().window().maximize();
		dv.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement un=dv.findElement(By.id("username"));
		un.sendKeys("demoSalesManager");
		WebElement pd=dv.findElement(By.id("password"));
		pd.sendKeys("crmsfa");
		dv.findElement(By.className("decorativeSubmit")).click();
		
		dv.findElement(By.linkText("CRM/SFA")).click();
		dv.findElement(By.linkText("Leads")).click();
		dv.findElement(By.linkText("Create Lead")).click();
		WebElement cname=dv.findElement(By.id("createLeadForm_companyName"));
		cname.sendKeys("Stark Industries");
		WebElement firstnm=dv.findElement(By.id("createLeadForm_firstName"));
		firstnm.sendKeys("Tony");
		WebElement lastnm=dv.findElement(By.id("createLeadForm_lastName"));
		lastnm.sendKeys("Stark");
		WebElement fnmloc=dv.findElement(By.id("createLeadForm_firstNameLocal"));
		fnmloc.sendKeys("Ironman");
		WebElement dept=dv.findElement(By.id("createLeadForm_departmentName"));
		dept.sendKeys("IT");
		WebElement des=dv.findElement(By.id("createLeadForm_description"));
		des.sendKeys("Learning automation testing");
		WebElement eml=dv.findElement(By.id("createLeadForm_primaryEmail"));
		eml.sendKeys("ironman@testing.com");
		WebElement co=dv.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd=new Select(co);
		dd.selectByVisibleText("United States");
		WebElement st=dv.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dp=new Select(st);
		dp.selectByVisibleText("New York");
		dv.findElement(By.className("smallSubmit")).click();
		String tt=dv.getTitle();
		System.out.println(tt);
		
		dv.findElement(By.linkText("Duplicate Lead")).click();
		dv.findElement(By.id("createLeadForm_companyName")).clear();
		dv.findElement(By.id("createLeadForm_companyName")).sendKeys("Marvel testing");
		dv.findElement(By.id("createLeadForm_firstName")).clear();
		dv.findElement(By.id("createLeadForm_firstName")).sendKeys("Anthony");
		dv.findElement(By.className("smallSubmit")).click();
		String title=dv.getTitle();
		System.out.println(title);
}

	
	

}

