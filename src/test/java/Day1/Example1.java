package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver r1=new ChromeDriver();
		r1.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		r1.manage().window().maximize();
		Thread.sleep(5000);
		r1.findElement(By.name("username")).sendKeys("Admin");
		r1.findElement(By.name("password")).sendKeys("admin123");
		r1.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		String org=r1.getTitle();
		String exp="OrangeHRM";
		if(org.equals(exp))
		{
			System.out.println("text passed");
		}
		else
		{
			System.out.println("text failed");
		}

	}

}
