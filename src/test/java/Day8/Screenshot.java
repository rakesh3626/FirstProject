package Day8;

import java.io.File; 
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.asos.com/women/");
		driver.manage().window().maximize();
		
		TakesScreenshot rr=(TakesScreenshot)driver;
		File source=rr.getScreenshotAs(OutputType.FILE);
		File trg=new File(".\\screenshots\\asos1.png");
		FileUtils.copyFile(source,trg);

	}

}
