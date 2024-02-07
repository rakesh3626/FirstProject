package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/");
		driver.manage().window().maximize();
		
		WebElement rr= driver.findElement(By.xpath("//input[@name='bdaytime']"));
		rr.sendKeys("18122023");
		rr.sendKeys(Keys.TAB);
		rr.sendKeys("1312");
		

	}

}
