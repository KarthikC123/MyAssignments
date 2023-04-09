package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.leafground.com/radio.xhtml");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.findElement(By.xpath("//label[text()='Chrome']")).click();
		d.findElement(By.xpath("//label[text()='Chennai']")).click();
		System.out.println("Default selected radio button is " + d.findElement(By.xpath("//label[text()='Safari']")).getText());
		System.out.println("Age group is already selected and is " + d.findElement(By.xpath("//label[text()='21-40 Years']")).getText());
	}

}
