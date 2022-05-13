package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.GrpExeBaseClass1;

public class CustomerModule5 extends GrpExeBaseClass1{
	@Test
	public void createCustomer() {
		Reporter.log("Create Customer",true);
	}
}
