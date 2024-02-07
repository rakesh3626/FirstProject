package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_method {
public WebDriver driver;
	
	@BeforeMethod
	public void url() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		
	}
	@Test(priority=1)
	public void login() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vamshinani");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vamshi@133");
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}
	

	@AfterMethod
	public void close() {
		driver.close();
	}

}
