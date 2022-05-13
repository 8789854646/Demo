package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClassCrossBro;

public class CrossBrowserBaseCls extends BaseClassCrossBro{
	
		@Test
		public void createCustomer() {
			Reporter.log("Create Customer",true);
		}
		
	}

