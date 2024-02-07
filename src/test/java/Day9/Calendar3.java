package Day9;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar3 {

	public static void main(String[] args) {
		int day=28;
		String month="May 2026";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
		
		while(true)
		{
			String curdate=driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(curdate);
			if(curdate.equals(month))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
		}
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='"+day+"']")).click();
	
	
	}

}
