package Day7;

import java.util.List;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_Webtable_handling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		driver.manage().window().maximize();
		
		int rows=driver.findElements(By.xpath("//*[@id=\"customers\"]//tr")).size();
		System.out.println("no of rows: "+rows);
		
		int col=driver.findElements(By.xpath("//*[@id=\"customers\"]//th")).size();
		System.out.println("no of columns: "+col);
		
		String value=driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[5]/td[4]")).getText();
		System.out.println(value);
		
		//retrieve total table
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=col;c++) {
				String tdata=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(tdata+" ");
			}
			System.out.println();
		}
		
		//click checkbox if its ola
		List<WebElement>tabledata=driver.findElements(By.xpath("//table[@id='customers']//td"));
		
		for(WebElement option:tabledata) {
			String value1=option.getText();
			System.out.println(value1);
			if(value1.equals("Ola"))
			{
				driver.findElement(By.xpath("//td[text()='Ola']//preceding-sibling::td//input")).click();
				driver.findElement(By.xpath("//td[text()='Ola']//following-sibling::td//a")).click();
				
			}
		}

	}

}
