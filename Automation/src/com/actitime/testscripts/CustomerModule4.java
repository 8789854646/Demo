package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.GrpExeBaseClass;
//Group Execuation
public class CustomerModule4 extends GrpExeBaseClass{
	@Test
	public void createCustomer() {
		Reporter.log("Create Customer",true);
	}

}
