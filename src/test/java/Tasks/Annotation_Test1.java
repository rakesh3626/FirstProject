package Tasks;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Test1 {
	public  WebDriver driver;
	
	@BeforeTest
	public void url() {
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	
	@Test
	public void login() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vamshinani");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vamshi@133");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
	}
	
}
