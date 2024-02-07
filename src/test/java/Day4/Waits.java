package Day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d1 = new ChromeDriver();
		d1.get("https://demoqa.com/elements");
		d1.manage().window().maximize();
		d1.findElement(By.xpath("//*[@id=\"item-0\"]")).click();
		
		d1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		d1.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Rakesh Prudhvi");
		d1.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("prudhvi.rakesh347@gmail.com");
		d1.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("7c,vaishnavi cynouser,gachibowli,hyderabad,500032hyderabad");
		d1.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("7c,vaishnavi cynouser,gachibowli,hyderabad,500032hyderabad");
		d1.findElement(By.id("submit")).submit();
		Thread.sleep(2000);
		d1.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
		d1.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
		d1.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']")).click();
		Thread.sleep(2000);
		d1.findElement(By.xpath("//span[normalize-space()='Radio Button']")).click();
	

	}

}
