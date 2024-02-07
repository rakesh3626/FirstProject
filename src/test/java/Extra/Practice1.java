package Extra;

import java.time.Duration;
import java.util.Calendar; 
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/bus-tickets/");
		driver.manage().window().maximize();
		String targmonth="February 2024";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@id='travelDate']")).click();
		
		while(true) {
		String curdate=driver.findElement(By.className("DayPicker-Caption")).getText();
        
		if(curdate.equals(targmonth))
        		{
        	break;
        		}
        	else {
        	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        		}
       	}
		driver.findElement(By.xpath("//div[@aria-label='Wed Feb 07 2024']")).click();
		

}
}
