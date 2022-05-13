package com.actitime.generics;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class GrpExeBaseClass {
	@BeforeTest(groups= {"smoke test","regression test"})
	public void openBrowser() {
		Reporter.log("Open Browser",true);
	}
    @AfterTest(groups= "smoke test")
    public void closeBrowser() {
    	Reporter.log("Close Browser",true);
    }
    @BeforeMethod(groups= "regression test")
    public void login() {
    	Reporter.log("Login",true);
    }
    @AfterMethod(groups= "regression test")
    public void logout() {
    	Reporter.log("Logout",true);
    }

}
