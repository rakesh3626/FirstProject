package DataDriven;

import java.io.IOException; 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase {

	public WebDriver driver;
	@BeforeClass
	public void launch() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void login() throws IOException {
		String file=System.getProperty("user.dir")+"/Data/TestData2.xlsx";
		int rows=ExcelUtils.getRowCount(file, "sheet1");
		for(int r=0;r<=rows;r++)
		{
			String username=ExcelUtils.getCellData(file, "sheet1", r, 0);
			String pwd=ExcelUtils.getCellData(file, "sheet1", r, 1);
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			String exp_url="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			String act_url=driver.getCurrentUrl();
			
			if(exp_url.equals(act_url))
			{
				System.out.println("Test is Passed");
				ExcelUtils.setCellData(file, "sheet1", r, 2, "Pass");
				ExcelUtils.FillGreenColour(file, "sheet1", r, 2);
				driver.findElement(By.className("oxd-userdropdown-name")).click();
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
			}
			else 
			{
				System.out.println("Test is Failed");
				ExcelUtils.setCellData(file, "sheet1", r, 2, "Fail");
				ExcelUtils.FillRedColour(file, "sheet1", r, 2);
			}
		}
	}
	@AfterClass
			void close() {
				driver.close();
			
		}
		
	}

