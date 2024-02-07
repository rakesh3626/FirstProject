package Testng;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_method {
	public WebDriver driver;
	
	@BeforeMethod
	public void login() {
		System.out.println("login method");
		
	}
	@Test(priority=1)
	public void search() {
		System.out.println("search method");
	}
	@Test(priority=2)
	public void addproduct() {
		System.out.println("add product method");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout method");
	}

}


