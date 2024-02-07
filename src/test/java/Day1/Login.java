package Day1;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
/*Assignement
----------------
1) Launch browser
2) open url
	URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
3) Provide username  - admin@yourstore.com
4) Provide password  - admin
5) Click on Login button 
6) Verify the title of dashboard page   
	Exp title : Dashboard / nopCommerce administration
7) Verify Dasboad


driver.getTitle();     --> returns the title of the webpage*/

public class Login {
public static WebDriver rr;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String browsername=sc.next();
		if(browsername.equals("edge"))
		{
		     rr=new EdgeDriver();
		}
		else if(browsername.equals("chrome"))
		{
			 rr=new ChromeDriver();
		}
		
		//ChromeDriver rr = new ChromeDriver();
		//WebDriver rr1=new ChromeDriver();
		//EdgeDriver rr2=new EdgeDriver();
		rr.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		rr.manage().window().maximize();
		rr.findElement(By.name("Email")).clear();
		rr.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		rr.findElement(By.name("Password")).clear();
		rr.findElement(By.name("Password")).sendKeys("admin");
		rr.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		String act_res=rr.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		String exp_res="Dashboard";
		if(exp_res.equals(act_res))
		{
			System.out.println("Login text passed");
		}
		else
		{
			System.out.println("login text failed");
		}
		String org=rr.getTitle();
		String exp="Dashboard / nopCommerce administration";
		if(exp.equals(org))
		{
			System.out.println("Dashboard Title passed");
		}
		else
		{
			System.out.println("Dashboard Title failed");
		}
		//catalog xpath
		rr.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p")).click();
		//products xpath
		rr.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a/p")).click();
	    
		String org_res1=rr.getTitle();
		System.out.println(org_res1);
		String exp_res1="Products / nopCommerce administration";
		if(exp_res1.equals(org_res1))
		{
			System.out.println("Products Text passed");
		}
		else
		{
			System.out.println("Product Text Failed");
		}
		//logout
		//rr.findElement(By.xpath("/html/body/div[3]/nav/div/ul/li[3]/a")).click();
	}
}


