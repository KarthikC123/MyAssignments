package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver dv=new ChromeDriver();
		dv.get("https://www.leafground.com/checkbox.xhtml");
		dv.manage().window().maximize();
		dv.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dv.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		dv.findElement(By.xpath("//span[text()='Ajax']")).click();
		dv.findElement(By.xpath("//label[text()='Java']")).click();
		dv.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
		dv.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		Boolean b=dv.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]")).isEnabled();
		System.out.println("The checkbox is disabled is: " +b);
		dv.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		Thread.sleep(1000);
		dv.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		dv.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		dv.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();
		dv.findElement(By.xpath("(//label[text()='Istanbul'])[2]")).click();
		dv.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
		
	}

}
