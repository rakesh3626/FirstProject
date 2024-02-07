package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*

1. Open url: https://adactinhotelapp.com/
2. Login to application
3. credentials username:vamshinani
password: Vamshi@133

Adactin.com - Hotel Reservation System
https://adactinhotelapp.com
*/

public class Task_2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver my1 = new ChromeDriver();
	my1.get("https://adactinhotelapp.com/");
	Thread.sleep(2000);
	my1.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("vamshinani");
	my1.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Vamshi@133");
	my1.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/form/table/tbody/tr[6]/td[2]/input")).click();
	

	}

}
