package Tasks;

/*Task3:
Url: https://www.saucedemo.com/
1. Login to website
2. There is a dropdown on the right
select price(low to high)
3. Add one product to cart
4. Goto  shopping cart
5. continue checkout
6. Enter information and continue
7. click on finish*/
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Swag_labs {
	public WebDriver driver;

	@BeforeClass
	void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}
	@Test(dataProvider="swag",priority=1)
		void login(String uname,String pwd) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();

	}
	@Test(priority=2)
	void dropdown() {
		
		Select price =new Select(driver.findElement(By.xpath("//select[@class='product_sort_container']")));
		price.selectByIndex(2);
	}
	@Test(priority=3)
	void addTocart() {
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	}
	@Test(dataProvider="check",priority=4)
	void checkout(String fname,String lname,String zipcode) {
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(lname);
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys(zipcode);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	@AfterClass
	void finish() {
		driver.findElement(By.xpath("//button[@id='finish']")).click();
	}
	@DataProvider(name="swag")
	String[][]loginData(){
		String[][] data= {{"standard_user","secret_sauce"}};
		return data;
		
	}
	@DataProvider(name="check")
	String[][]checkoutdata(){
		String[][] codata= {{"Rakesh","Prudhvi","500008"}};
		return codata;
	}
}
