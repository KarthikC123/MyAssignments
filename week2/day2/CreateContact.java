package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver dv=new ChromeDriver();
		dv.get("http://leaftaps.com/opentaps/control/login");
		dv.manage().window().maximize();
		dv.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement usr=dv.findElement(By.id("username"));
		usr.sendKeys("demoSalesManager");
		WebElement pwd=dv.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		dv.findElement(By.className("decorativeSubmit")).click();
		dv.findElement(By.linkText("CRM/SFA")).click();
		dv.findElement(By.linkText("Contacts")).click();
		dv.findElement(By.linkText("Create Contact")).click();
		dv.findElement(By.id("firstNameField")).sendKeys("Karthik");
		dv.findElement(By.id("lastNameField")).sendKeys("C");
		dv.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Karthick");
		dv.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("C");
		dv.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		dv.findElement(By.id("createContactForm_description")).sendKeys("Learning Testing");
		dv.findElement(By.id("createContactForm_primaryEmail")).sendKeys("karthik@testing.com");
		WebElement s=dv.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select st=new Select(s);
		st.selectByVisibleText("New York");
		dv.findElement(By.className("smallSubmit")).click();
		dv.findElement(By.linkText("Edit")).click();
		dv.findElement(By.id("updateContactForm_description")).clear();
		dv.findElement(By.id("updateContactForm_importantNote")).sendKeys("Learning testing through TestLeaf");
		dv.findElement(By.xpath("//input[@name='submitButton']")).click();
		String title=dv.getTitle();
		System.out.println(title);
	}

}
