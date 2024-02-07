package Testng;

import org.testng.annotations.Test;

public class Grouping {
	@Test(groups= {"smoke"})
	public void loginbyGmail() {
		System.out.println("loginbyGmail");
	}
	
	@Test(groups= {"smoke","regression"})
	public void loginbyFacebook() {
		System.out.println("loginbyFacebook");
	}
	
	@Test(groups= {"regression"})
	public void loginbyTwitter() {
		System.out.println("loginbyTwitter");
	}

}
