package open_cart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log_in {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		//Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		Thread.sleep(2000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		dropdown.click();
		Thread.sleep(2000);
		
		Select selectobject = new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		selectobject.selectByIndex(3);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(2000);
		
		
		
		//driver.findElement(By.xpath("//button[@id='remove-sauce-labs-onesie']")).click();
		
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("standard");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("3000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
		Thread.sleep(2000);
		
		
		driver.close();
	}

}
