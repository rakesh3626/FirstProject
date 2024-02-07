package Testng;

import org.openqa.selenium.WebDriver; 
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Annotation_class {
		public WebDriver driver;
		
		@BeforeClass
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
		@AfterClass
		public void logout() {
			System.out.println("logout method");
		}
}

