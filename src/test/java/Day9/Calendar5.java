package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='third_date_picker']")).click();
		
		Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText("Dec");
		
		Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByVisibleText("2025");
		
		driver.findElement(By.xpath("//a[text()='21']")).click();
		
		
		
		
		
	}

}
