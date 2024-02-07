package Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windows=driver.getWindowHandles();
		List<String> ids=new ArrayList(windows);
		String parent=ids.get(0);
		String child=ids.get(1);
		
		//parent to child
		for(String values:windows) {
			driver.switchTo().window(child);
			driver.findElement(By.id("alertBox")).click();
		}
		
		
		/*
		//By using Iteroator method
		
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> ids=windows.iterator();
		String parent=ids.next();
		String child=ids.next();
		
		
		System.out.println("parent id:"+parent);
		System.out.println("child id:"+child);
		
		//switch from parent to child
		driver.switchTo().window(child);
		driver.findElement(By.id("alertBox")).click();
		*/

	}

}
