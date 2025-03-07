package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaymentPage {
	
	public static void main(String[] args) {
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://proxify.gg/dashboard");
		
		Driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("2.3");
		Driver.findElement(By.xpath("//div[contains(text(),'Continue to Payment')]")).click();
	}
   
}