package com.actitime.generics;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	@BeforeTest
	public void openBrowser() {
		Reporter.log("Open Browser",true);
	}
    @AfterTest
    public void closeBrowser() {
    	Reporter.log("Close Browser",true);
    }
    @BeforeMethod
    public void login() {
    	Reporter.log("Login",true);
    }
    @AfterMethod
    public void logout() {
    	Reporter.log("Logout",true);
    }
    
}
