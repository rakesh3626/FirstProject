package Tasks;

import java.time.Duration; 
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task_4 {
//	Task: 
//		Write script for webtable
//		1. Click on checkbox if the company name is amazon
//		2. click on know more link if the country is UK
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();
		
		//click on checkbox if the company name is Amazon
		List<WebElement>tabledata=driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		for(WebElement options:tabledata) {
			String values=options.getText();
			if(values.equals("Amazon")) {
				driver.findElement(By.xpath("//td[text()='Amazon']//preceding-sibling::td//input")).click();
			}
			else if(values.equals("UK"))
			{
				driver.findElement(By.xpath("//td[text()='UK']//following-sibling::td//a")).click();
			}
		}
	}
}
