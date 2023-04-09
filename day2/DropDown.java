package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.leafground.com/select.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement tt=d.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
	    Select dd=new Select(tt);
		dd.selectByVisibleText("Selenium");
		d.findElement(By.id("j_idt87:country_label")).click();
		d.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//label[text()='Select City']")).click();
		d.findElement(By.xpath("//li[@data-label='Chennai']")).click();
		d.findElement(By.xpath("//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']")).click();
		d.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//label[text()='Select Language']")).click();
		d.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//label[text()='Select Values']")).click();
		d.findElement(By.xpath("//li[text()='Two']")).click();
	}

}
