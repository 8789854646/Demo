package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GrpExeCustomerModule {
	@Test(groups={"smoke test","regression test"})
	public void createCustomer() {
		Reporter.log("CreateCustomer",true); 

   }
	@Test(groups="regression test")
	public void modifyCustomer() {
		Reporter.log("modifyCustomer",true); 
	}
	@Test(groups="regression test")
	public void deleteCustomer() {
		Reporter.log("deleteCustomer",true);
	}
}
