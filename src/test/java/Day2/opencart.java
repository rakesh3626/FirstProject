package Day2;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class opencart {

	public static void main(String[] args) {
		WebDriver r3 = new ChromeDriver();
		r3.get("https://demo.opencart.com/");
		r3.manage().window().maximize();
		boolean logoStatus=r3.findElement(By.id("logo")).isDisplayed();
        System.out.println("logo is displayed: "+logoStatus);
        //r3.findElement(By.linkText("Desktops")).click();
        r3.findElement(By.partialLinkText("Table")).click();
        List<WebElement> headLinks=r3.findElements(By.className("list-inline-item"));
        System.out.println("num of header links: "+headLinks.size());
        List<WebElement> image=r3.findElements(By.tagName("img"));
        System.out.println("num of images: "+image.size());
        List<WebElement> links=r3.findElements(By.tagName("a"));
        System.out.println("no of links: "+links.size());
       
	}

}
