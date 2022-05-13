package com.actitime.generics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementation extends BaseClassScreenShot implements ITestListener {
   //Go to Source in Eclipse and select override/generate implementation and select all of Override annotations
	
	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File desc=new File("./ScreenShot/"+res+".png");
		try {
			FileUtils.copyFile(src, desc);
		} 
		catch (IOException e) {
			
		}
	}

	//Write TakesScreenShot script
	@Override
	public void onTestFailure(ITestResult result) {
		//Take multiple screen shot 
		String res = result.getName();
		TakesScreenshot t=(TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File desc=new File("./ScreenShot/"+res+".png");
		try {
			FileUtils.copyFile(src, desc);
		} 
		catch (IOException e) {
			
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
	}

}
