package Tasks;

import java.time.Duration;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Annotation_Test2 {
public WebDriver driver;

@Test
public void login() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("vamshinani");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Vamshi@133");
	driver.findElement(By.xpath("//input[@id='login']")).click();
}
	@Test(priority=2)
	public void bookingItinerary() {
		driver=new ChromeDriver();
		driver.findElement(By.xpath("//a[normalize-space()='Booked Itinerary']")).click();
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}

}
