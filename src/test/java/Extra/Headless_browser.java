package Extra;

import org.openqa.selenium.WebDriver; 

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_browser {
	public static void main(String[] args) {
	
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless");
		
		WebDriver r5=new ChromeDriver(option);
		r5.get("https://adactinhotelapp.com/");
		System.out.println("Title of the Page: "+r5.getTitle());


		
	}

}
