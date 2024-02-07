package Day3;

import java.time.Duration;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaits {




	public static void main(String[] args) {
		WebDriver d3=new ChromeDriver();
		d3.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		d3.manage().window().maximize();
		Wait<WebDriver> wait=new FluentWait<WebDriver>(d3)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(ElementNotInteractableException.class);

		


	}

	private Object withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

}
