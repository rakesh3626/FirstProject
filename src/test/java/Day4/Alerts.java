package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d2=new ChromeDriver();
		d2.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		d2.manage().window().maximize();
		d2.findElement(By.xpath("//button[@id='alertBox']")).click();
		System.out.println(d2.switchTo().alert().getText());
		d2.switchTo().alert().accept();
		//confirmation box
		//d2.findElement(By.xpath("//button[@id='confirmButton']")).click();
		//System.out.println(d2.switchTo().alert().getText());
		//d2.switchTo().alert().dismiss();
		//prompt 
		Thread.sleep(2000);
		d2.findElement(By.xpath("//button[@id='promptBox']")).click();
		d2.switchTo().alert().getText();
		d2.switchTo().alert().sendKeys("Hello...");
		d2.switchTo().alert().accept();

	}

}
