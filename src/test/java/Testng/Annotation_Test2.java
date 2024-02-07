package Testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotation_Test2 {
	public WebDriver driver;
	
	@Test
	public void abc1() {
		System.out.println("abc1 method class 2");
		
	}
	@AfterTest
	public void xyz1() {
		System.out.println("xyz1 method class2");
	}
}
