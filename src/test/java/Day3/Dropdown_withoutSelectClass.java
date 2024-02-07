package Day3;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_withoutSelectClass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		List<WebElement> alloptions=driver.findElements(By.id("course"));
		
			for(int i=0;i<alloptions.size();i++) 
			{
				String drp=alloptions.get(i).getText();
				System.out.println(drp);
			}
			for(WebElement value:alloptions) {
				if(value.getText().equals("Java")) {
					value.click();
					break;
			
			}
		}

	}
}

