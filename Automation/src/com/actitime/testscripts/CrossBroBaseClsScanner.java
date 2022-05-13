package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClsCrossBroScanner;

public class CrossBroBaseClsScanner extends BaseClsCrossBroScanner{

		@Test
		public void createCustomer() {
			Reporter.log("Create Customer",true);
		}
	}