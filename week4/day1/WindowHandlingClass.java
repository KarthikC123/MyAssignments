package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingClass {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).sendKeys("oneplus 9 pro");
		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		WebElement pr=d.findElement(By.xpath("//span[@class='a-price-whole']"));
		System.out.println("Price of 1st product is: " + pr.getText());
		WebElement rt=d.findElement(By.xpath("//span[@class='a-size-base s-underline-text']"));
		System.out.println("Number of ratings for the 1st product is " + rt.getText());
		d.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		Set<String> st=d.getWindowHandles();
		List<String> ls=new ArrayList<String>(st);
		d.switchTo().window(ls.get(1));
		Thread.sleep(3000);
		d.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//span/input[@class='a-button-input'])[18]")).click();
		WebElement sub=d.findElement(By.xpath("//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap']"));
		System.out.println("Subtotal is " + sub.getText());
		d.close();
		
				}

}
