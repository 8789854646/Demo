package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Demo {
	@Test
	public void testDemo() {
		Reporter.log("bye",true);
		Reporter.log("hi");
		Reporter.log("Hello",false);
		System.out.println("Welcome");
	}

}
