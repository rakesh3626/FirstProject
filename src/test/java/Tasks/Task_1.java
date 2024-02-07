package Tasks;

		/*Task: Write script for below flow  
		1. Open url: https://adactinhotelapp.com/
		2. get the title, current url
		3. navigate to https://demo.opencart.com/
		4. get the title, current url
		5. goto previous page
		6. goto forward
		7. reload webpage
		8. close*/

		import org.openqa.selenium.WebDriver; 
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Task_1 {

			public static void main(String[] args)  {
				WebDriver r4=new ChromeDriver();
				r4.get("https://adactinhotelapp.com/");
				System.out.println("Title of this page: "+r4.getTitle());
				r4.navigate().to("https://demo.opencart.com/");
				System.out.println("Currenturl is: "+r4.getCurrentUrl());
				r4.navigate().back();
				r4.navigate().forward();
				r4.navigate().refresh();
				r4.close();
			}


	}


