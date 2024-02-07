package Extra;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {

	public static void main(String[] args) {
		
		String org ="rakesh";
		String rev="";
		int len=org.length();		
		for(int r=len-1;r>=0;r--)
		{
		rev=rev+org.charAt(r);
		}
		System.out.println(rev);
	
	}

}
