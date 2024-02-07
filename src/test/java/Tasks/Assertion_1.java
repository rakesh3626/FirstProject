package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Assertion_1 {
	
	public WebDriver driver;
	 public void Assert() {
		 driver=new ChromeDriver();
		 driver.get("https://products.ncryptedprojects.com/taskgator/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//span[@data-hover='Login']")).click();
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("seller.ncrypted@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		 driver.findElement(By.xpath("//input[@id='login']")).click();
		 
		 String x="Provider";
		 String y=driver.findElement(By.xpath("//h4[normalize-space()='Provider']")).getText();
		 //Hard Assert
		 org.testng.Assert.assertEquals(x, y);
		 
		 //SoftAssert s=new SoftAssert();
		 //s.assertEquals(x, y);
		 //s.assertAll();
		 //System.out.println("Successfully validated");
	 }

}
