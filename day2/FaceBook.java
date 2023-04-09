package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) {
	ChromeDriver d=new ChromeDriver();
	d.get("https://en-gb.facebook.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	d.findElement(By.linkText("Create new account")).click();
	WebElement fn=d.findElement(By.xpath("//input[@name='firstname']"));
	fn.sendKeys("Karthika");
	WebElement ln=d.findElement(By.xpath("//input[@name='lastname']"));
	ln.sendKeys("C");
	WebElement em=d.findElement(By.xpath("//input[@name='reg_email__']"));
	em.sendKeys("7034657972");
	WebElement pd=d.findElement(By.xpath("//input[@name='reg_passwd__']"));
	pd.sendKeys("karthika@123");
	WebElement day=d.findElement(By.name("birthday_day"));
	Select dd=new Select(day);
	dd.selectByVisibleText("12");
	WebElement mon=d.findElement(By.name("birthday_month"));
	Select mm=new Select(mon);
	mm.selectByVisibleText("Jan");
	WebElement yr=d.findElement(By.name("birthday_year"));
	Select yy=new Select(yr);
	yy.selectByVisibleText("1997");
	d.findElement(By.name("sex")).click();
	d.findElement(By.name("websubmit")).click();
	
}
}
