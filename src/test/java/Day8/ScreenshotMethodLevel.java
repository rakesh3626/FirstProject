package Day8;

import java.io.File; 
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotMethodLevel {

	public static WebDriver driver;
	
	public static void Screenshot() throws IOException
	{
		TakesScreenshot rr=(TakesScreenshot)driver;
		File source=rr.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\orangehrm.png");
		FileUtils.copyFile(source,trg);
	}
	public static void main(String[] args) throws IOException {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Screenshot();
	}
}
