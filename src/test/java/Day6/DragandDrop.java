package Day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement r1=driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
		WebElement r2=driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
		WebElement r3=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement r4=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement r5=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement r6=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement r7=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement r8=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(r1, r2).perform();
		act.dragAndDrop(r3, r4).perform();
		act.dragAndDrop(r5, r6).perform();
		act.dragAndDrop(r7, r8).perform();
		

	}

}
