package Day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Uploading_file {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("F:\\ASOS Sprint 2\\ASOS test cases\\Rakesh ASOS Test cases.xlsx");
		
		WebElement ele=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		
		//upload file using robot class
		Robot RB=new Robot();
		
		//copy the file from local folder
		StringSelection ss=new StringSelection("C:\\Users\\Admin\\Downloads\\ASSOS SCENARIOS.xlsx");//select the file
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);//copy the file
		
		//paste the data ctrl+V
		RB.keyPress(KeyEvent.VK_CONTROL);
		RB.keyPress(KeyEvent.VK_V);
		
		//release the keys
		RB.keyRelease(KeyEvent.VK_CONTROL);
		RB.keyRelease(KeyEvent.VK_V);
		
		//enter key on keyboard to upload the file
		RB.keyPress(KeyEvent.VK_ENTER);
		
		RB.keyRelease(KeyEvent.VK_ENTER);
	}


	}

