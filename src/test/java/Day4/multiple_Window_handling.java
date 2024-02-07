package Day4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_Window_handling {
	/*
	 * Task: 1. Open Url:https://www.hyrtutorials.com/p/window-handles-practice.html 
	 * 2. click on button "open multiple windows" 
	 * 3. Switch to child window 2 and get title of child 2
	 */
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"newWindowsBtn\"]")).click();
		Set<String>windows=driver.getWindowHandles();
		Iterator <String>ids=windows.iterator();
		String parent=ids.next();
		String child1=ids.next();
		String child2=ids.next();
		System.out.println(parent);
		System.out.println(child1);
		System.out.println(child2);
		
		String title=driver.switchTo().window(child2).getTitle();
		System.out.println(title);
		
	
		}

	}

