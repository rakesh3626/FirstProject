package Day7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_WebTable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("demo");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("demo");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		driver.findElement(By.xpath("//li[@id='menu-customer']")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse-5\"]/li[1]/a")).click();
		
		String pages=driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[2]/div[2]")).getText();
		System.out.println(pages);
		
		int totalpages=Integer.parseInt(pages.substring(pages.indexOf("(")+1,pages.indexOf("Pages")-1));
		System.out.println("total no of pages:"+totalpages);
		
		//for(int p=1;p<4;p++)
		//{
			//WebElement cur_page=driver.findElement(By.xpath("//ul[@class='pagination']//li//*[text()='"+p+"']"));
			//System.out.println("current page number: "+cur_page.getText());
			
			int rows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tr")).size();
			System.out.println("no of rows in cur page: "+rows);
			
		for(int r=1;r<=rows;r++)
		{
			String C_names=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tr["+r+"]//td[2]")).getText();
			System.out.println(C_names);
		}
			
		}
		
		
	

}
