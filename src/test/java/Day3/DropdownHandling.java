package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) {
		WebDriver d2=new ChromeDriver();
		d2.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		d2.manage().window().maximize();
		//Select drpdwn=new Select(d2.findElement(By.xpath("//select[@id='first']")));
		//drpdwn.selectByVisibleText("Google");
		//drpdwn.selectByIndex(1);
		//drpdwn.selectByValue("Microsoft");
		//multy dropdown
		Select multydwn=new Select(d2.findElement(By.xpath("//select[@id='second']")));
		if(multydwn.isMultiple())
		{
			multydwn.selectByIndex(0);
			multydwn.selectByValue("burger");
		}
	}

}
