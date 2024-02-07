package Day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static  void main(String[] args) {
		ChromeDriver r1 =new ChromeDriver();
		r1.get("https://demo.opencart.com/");
		r1.manage().window().maximize();
		r1.findElement(By.name("search")).sendKeys("mac");
		boolean logoStatus=r1.findElement(By.id("logo")).isDisplayed();
		System.out.println("logo status displayed: "+logoStatus);
		//r1.findElement(By.linkText("Tablets")).click();
		//r1.findElement(By.partialLinkText("Table")).click();
		//List<WebElement> headlinks= r1.findElements(By.className("list-inline-item"));
		//System.out.println("num of header links: "+headlinks.size());
		List<WebElement> image =r1.findElements(By.tagName("img"));
		System.out.println("num of images: "+image.size());
		List<WebElement> links=r1.findElements(By.tagName("a"));
		System.out.println("num of links: "+links.size());
		
	    for(WebElement link:links)
	    {
	    	System.out.println(link.getText());
	    }
	    //r1.quit();

	}

}
