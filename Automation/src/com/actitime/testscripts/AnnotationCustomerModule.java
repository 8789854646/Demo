package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationCustomerModule {
 @BeforeClass
 public void openBrowser() {
	 Reporter.log("Open Browser",true);
 }
 @AfterClass
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
 @Test
 public void createCustomer() {
	 Reporter.log("Create Customer",true);
 }
 @Test
 public void deleteCustomer() {
	 Reporter.log("Delete Customer",true);
 }
}
