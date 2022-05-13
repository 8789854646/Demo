package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
//we extends BaseClass from generic package
public class CustomerModule1 extends BaseClass {
	@Test
	public void createCustomer() {
		Reporter.log("Create Customer",true);
	}

}
