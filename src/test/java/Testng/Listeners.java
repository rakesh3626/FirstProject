package Testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("test is sart...");		
}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is success...");
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is failed...");
	}
	public void onTestSkipped(ITestResult reslut) {
		System.out.println("Test is skipped...");
	}
	public void onFinish(ITestContext context) {
		System.out.println("Test is finished...");
	}
}