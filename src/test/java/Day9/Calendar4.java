package Day9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar4 {

	public static void main(String[] args) throws Exception {
		
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		Calendar cal=Calendar.getInstance();
		String targdate="16/July/2025";
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/MMM/yyyy");
		
		try {
			dateformat.setLenient(false);
			Date formateddate=dateformat.parse(targdate);
			cal.setTime(formateddate);
			int targday=cal.get(cal.DAY_OF_MONTH);
			int targmonth=cal.get(cal.MONTH);
			int targyear=cal.get(cal.YEAR);
			
			driver.findElement(By.xpath("//input[@id='first_date_picker']")).click();
			String curdate=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			cal.setTime(new SimpleDateFormat("MMMyyyy").parse(curdate));
			int curmonth=cal.get(cal.MONTH);
			int curyear=cal.get(cal.YEAR);
			while(targmonth>curmonth||targyear>curyear)
			{
				
				driver.findElement(By.className("ui-datepicker-next")).click();
			    curdate=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			   cal.setTime(new SimpleDateFormat("MMMyyyy").parse(curdate));
			   curmonth=cal.get(cal.MONTH);
				curyear=cal.get(cal.YEAR);
			
			}
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()='"+targday+"']")).click();
			
			
		} catch (Exception e) {
			
			throw new Exception("targdate is invalid");
		}

	}

}
