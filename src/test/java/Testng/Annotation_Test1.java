package Testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_Test1 {
	public WebDriver driver;
	
	@Test
	public void abc() {
		System.out.println("abc method class 1");
		
	}
	@BeforeTest
	public void xyz() {
		System.out.println("xyz method class 1");
	}
}
