package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_webpage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		//Alerts alert=new Alerts();
		WebElement element=driver.findElement(By.xpath("//button[@id='promtButton']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", element);
		js.executeScript("window.scrollBy(0,250)","");
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		element.click();
		
		driver.switchTo().alert().sendKeys("test");
		driver.switchTo().alert().accept();
		
	}

	}

