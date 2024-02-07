package Testng;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	public WebDriver driver;
	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://products.ncryptedprojects.com/taskgator/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="TaskGator")
		void login(String uname,String pwd) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[@data-hover='Login']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@id='sbtLogin']")).click();
		driver.findElement(By.xpath("//button[@class='btn dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
	}
		@AfterClass
	void end() {
		driver.close();
	}
	@DataProvider(name="TaskGator")
	String[][]loginData(){
		String[][] data= {
				{"buyer.ncrypted@gmail.com","123"},
				{"seller.ncrypted@gmail.com","123456"}
		};
		return data;
		
		}
	

}
