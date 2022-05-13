package com.actitime.testscripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass1;

public class CustomerModule2 extends BaseClass1 {
	@Test
	public void createCustomer() throws InterruptedException {
		Reporter.log("Create Customer",true);
		//Thread.sleep(4000);
		//when below statement write then result give failures
		//Assert.fail();
		
	}

}
