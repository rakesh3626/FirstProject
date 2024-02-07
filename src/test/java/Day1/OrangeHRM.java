package Day1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OrangeHRM {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		String browserType=sc.next();
		switch (browserType) 
		{
		case "firefox":driver = new FirefoxDriver();break;
		case "chrome":driver = new ChromeDriver();break;
		case "edge":driver = new EdgeDriver();break;
		case "IE":driver = new InternetExplorerDriver();break;
		default:System.out.println("browser : " + browserType + " is invalid");
			
		}
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	String org=driver.getTitle();
	String exp="OrangeHRM";
	if(org.equals(exp))
	{
		System.out.println("Login text passed");
	}
	else
	{
		System.out.println("Login text failed");
	}
	driver.findElement(By.xpath("/html/body")).click();
	Thread.sleep(2000);
	List<WebElement> image =driver.findElements(By.tagName("img"));
	System.out.println("num of images: "+image.size());
	
}
}
