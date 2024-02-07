package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar2 {

	public static void main(String[] args) {
		int day=31;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='sixth_date_picker']")).sendKeys("12/20/2023");
		
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='"+day+"']")).click();
		
		driver.findElement(By.xpath("//input[@id='second_date_picker']")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()='"+day+"']")).click();
		
		
	}

}
