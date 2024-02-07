package Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

public class Assertions {

	@Test
	void test() {
		
		int x=10;
		int y=10;
		/*if(x==y) {
			System.out.println("both are same");
		}else {
			System.out.println("both are not same");
		}*/
		//Hard Assert
	
		
		//Soft Assert
		//SoftAssert sa=new SoftAssert();
		//sa.assertEquals(x, y);
		//sa.assertAll();
	}

}
