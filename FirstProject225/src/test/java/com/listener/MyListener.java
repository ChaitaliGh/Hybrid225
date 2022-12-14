package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class MyListener implements ITestListener{

public void onTestStart(ITestResult result) {//we will use this method to create report
		
		System.out.println("Testcase started with name: " +result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Testcase passed with name: " +result.getName());
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testcase failed with name: " +result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Testcase skipped with name: " +result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		System.out.println("TestSuite Started");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("TestSuite finished");

		
	}
	
	
}
