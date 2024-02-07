package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods {
	public WebDriver driver;
	@Test(priority=1)
	public void openurl() {
		driver=new ChromeDriver();
		 driver.get("https://products.ncryptedprojects.com/taskgator/");
		 driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void login() {
		Assert.assertFalse(true);//intentionally failed
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//span[@data-hover='Login']")).click();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("buyer.ncrypted@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		 driver.findElement(By.xpath("//button[@id='sbtLogin']")).click();
	}
	//@Test(priority=3)
	@Test(priority=3,dependsOnMethods= {"login"})
	public void logout() {
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}
		
	}

