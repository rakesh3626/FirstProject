package Tasks;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Write script for locators
1. Open URL:https://www.hyrtutorials.com/p/add-padding-to-containers.html
2. fill the details

XPath Practice
https://www.hyrtutorials.com*/


public class Task_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver my1 = new ChromeDriver();
		my1.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(2000);
		my1.findElement(By.name("name")).sendKeys("Rakesh");
		my1.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[2]")).sendKeys("prudhvi");
		my1.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[3]")).sendKeys("prudhvi.rakesh347@gmail.com");
		my1.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/div[2]/input")).sendKeys("rakesh@123");
		my1.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[4]")).sendKeys("rakesh@123");
		my1.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/div[3]/button[1]")).click();
	System.out.println("Registration text is passed");
	}

}
