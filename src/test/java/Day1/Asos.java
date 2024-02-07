package Day1;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asos {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver rr2= new ChromeDriver();
		rr2.get("https://www.asos.com/women/");
		Thread.sleep(2000);
		rr2.findElement(By.linkText("Careers at ASOS")).click();
		
       // Thread.sleep(3000);
		//List<WebElement> link=rr2.findElements(By.className(""));
        //System.out.println("num of links: "+link.size());
	}

}
