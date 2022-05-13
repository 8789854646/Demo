package com.actitime.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClassScreenShot;

//@Listeners annotations (Fullqualifiedname or Package.class extension)
@Listeners(com.actitime.generics.ListenersImplementation.class)
public class ScreenShotCutomerModule extends BaseClassScreenShot {
	
	@Test
	public void createCustomer() throws InterruptedException {
		Reporter.log("Create Customer",true);
		Thread.sleep(4000);
		Assert.fail();
	}
	
	@Test
	public void deleteTask() throws InterruptedException {
		Reporter.log("deleteTask",true);
		Thread.sleep(4000);
		//Assert.fail();
	}
}
