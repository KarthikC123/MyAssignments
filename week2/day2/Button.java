package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.leafground.com/button.xhtml");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dr.findElement(By.xpath("//span[text()='Click']")).click();
		Thread.sleep(2000);
		System.out.println(dr.getTitle());
		dr.navigate().back();
		Thread.sleep(2000);
		System.out.println(dr.findElement(By.name("j_idt88:j_idt92")).isEnabled());
		System.out.println(dr.findElement(By.id("j_idt88:j_idt94")).getLocation());
		
		}

}
