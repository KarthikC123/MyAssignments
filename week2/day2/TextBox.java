package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class TextBox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver dv=new ChromeDriver();
		dv.get("https://www.leafground.com/input.xhtml");
		dv.manage().window().maximize();
		dv.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		dv.findElement(By.name("j_idt88:name")).sendKeys("Karthik C");
		dv.findElement(By.name("j_idt88:j_idt91")).sendKeys(",India");
		System.out.println(dv.findElement(By.name("j_idt88:j_idt93")).isEnabled());
		dv.findElement(By.name("j_idt88:j_idt95")).clear();
		System.out.println(dv.findElement(By.name("j_idt88:j_idt97")).getAttribute("value"));
		dv.findElement(By.name("j_idt88:j_idt99")).sendKeys("karthikch97@gmail.com",Keys.TAB);
		dv.findElement(By.name("j_idt88:j_idt101")).sendKeys("My name is Karthik.I am learning automation testing.");
		dv.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Random text for testing");
		//dv.findElement(By.name("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		System.out.println(dv.findElement(By.name("j_idt106:float-input")).getLocation());
		dv.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("Karthik");
		Thread.sleep(2000);
		dv.findElement(By.xpath("//li[text()='2']")).click();
		dv.findElement(By.name("j_idt106:j_idt122")).click();
		Thread.sleep(2000);
		dv.findElement(By.xpath("//button[text()='k']")).click();
		dv.findElement(By.xpath("//button[@title='Close the keypad']")).click();
		dv.findElement(By.xpath("//div[@data-placeholder='Enter your content']")).sendKeys("Testing custom toolbar");
	}

}
