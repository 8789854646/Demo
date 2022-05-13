package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GrpExeTaskModule {
	@Test(groups={"smoke test","regression test"})
	public void createTask() {
		Reporter.log("CreateTask",true); 
	}
	@Test(groups="regression test")
	public void modifyTask() {
		Reporter.log("modifyTask",true); 
	}
	@Test(groups="regression test")
	public void deleteTask() {
		Reporter.log("deleteTask",true);
	}

}
