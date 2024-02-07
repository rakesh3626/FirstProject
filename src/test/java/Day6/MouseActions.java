package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		WebElement DC=driver.findElement(By.id("doubleClickBtn"));
		
		Actions act=new Actions(driver);
		act.doubleClick(DC).perform();// perform double click
		WebElement RC=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(RC).perform();// perform right click
	}


	}

