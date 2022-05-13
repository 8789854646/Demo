package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
	@Test(priority=1)
	public void createCustomer() {
		Reporter.log("CreateCustomer",true); 
	}
	@Test(priority=2,dependsOnMethods = "createCustomer")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true); 
	}
	@Test(priority=3,dependsOnMethods = {"createCustomer","modifyCustomer"})
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}

}
