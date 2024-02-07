package CluodTesla;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CloudTesla {
	
	public WebDriver driver;
	
		
	@Test(dataProvider="cloudtesla")
	public void signup(String fname,String clientid,String mnumber,String emailid,String uname,String pwd,String desc) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://e2e.cloudtesla.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@placeholder='Client id']")).sendKeys(clientid);
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys(mnumber);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='desc']")).sendKeys(desc);
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	}
	
	@DataProvider(name="cloudtesla")
	public String[][]signupdata(){
		String[][] data= {{"testuser","test_interviewclient","8989898989","user1@gmail.com","user1","123456","tester"}};
	return data;
	}
	

}
