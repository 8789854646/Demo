package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(priority=1)
	public void createProject() {
		Reporter.log("CreateProject",true); 
	}
	@Test(priority=2,dependsOnMethods = "createProject")
	public void modifyProject() {
		Reporter.log("modifyProject",true); 
	}
	@Test(priority=3,dependsOnMethods = {"createProject","modifyProject"})
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}


}
