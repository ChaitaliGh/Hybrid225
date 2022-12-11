package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utils.DriverUtils;

public class MyListener extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {//we will use this method to create report
		
		test=report.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test case PASSED");
		
	}

	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "Test case failed");
		try {
			String path=DriverUtils.getScreenshot(result.getName());
			test.addScreenCaptureFromPath(path);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		
		test.log(Status.SKIP, "Test case Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	public void onStart(ITestContext context) {
		reportInit();
		
	}

	public void onFinish(ITestContext context) {
		report.flush();
		
	}
	
	

}
