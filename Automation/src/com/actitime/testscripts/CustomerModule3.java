package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass2;

public class CustomerModule3 extends BaseClass2 {
	@Test
	public void createCustomer() {
		Reporter.log("Create Customer",true);
	}
}
