package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GrpExeProjectModule {
	@Test(groups={"smoke test","regression test"})
	public void createProject() {
		Reporter.log("CreateProject",true); 
	}
	@Test(groups="regression test")
	public void modifyProject() {
		Reporter.log("modifyProject",true); 
	}
	@Test(groups="regression test")
	public void deleteProject() {
		Reporter.log("deleteProject",true);
	}


}
