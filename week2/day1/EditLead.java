package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/login");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement us=d.findElement(By.id("username"));
		us.sendKeys("demoSalesManager");
		WebElement pw=d.findElement(By.id("password"));
		pw.sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.linkText("CRM/SFA")).click();
		d.findElement(By.linkText("Leads")).click();
		d.findElement(By.linkText("Create Lead")).click();
		WebElement cn=d.findElement(By.id("createLeadForm_companyName"));
		cn.sendKeys("Wayne Industries");
		WebElement fn=d.findElement(By.id("createLeadForm_firstName"));
		fn.sendKeys("Bruce");
		WebElement ln=d.findElement(By.id("createLeadForm_lastName"));
		ln.sendKeys("Wayne");
		WebElement fnloc=d.findElement(By.id("createLeadForm_firstNameLocal"));
		fnloc.sendKeys("Batman");
		WebElement dept=d.findElement(By.id("createLeadForm_departmentName"));
		dept.sendKeys("IT");
		WebElement desc=d.findElement(By.id("createLeadForm_description"));
		desc.sendKeys("Learning Testing");
		WebElement eml=d.findElement(By.id("createLeadForm_primaryEmail"));
		eml.sendKeys("batman@testing.com");
		WebElement cnt=d.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dd=new Select(cnt);
		dd.selectByVisibleText("United States");
		WebElement st=d.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dp=new Select(st);
		dp.selectByVisibleText("New York");
		d.findElement(By.className("smallSubmit")).click();
		d.findElement(By.xpath("//a[text()='Edit']")).click();
		d.findElement(By.id("updateLeadForm_description")).clear();
		WebElement in=d.findElement(By.id("updateLeadForm_importantNote"));
		in.sendKeys("Important note");
		d.findElement(By.xpath("//input[@value='Update']")).click();
		String tl=d.getTitle();
		System.out.println(tl);
		

	}

}
