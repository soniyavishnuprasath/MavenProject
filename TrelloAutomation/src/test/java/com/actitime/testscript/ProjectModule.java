package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test
	public void createProject()
	{
		Reporter.log("createProject",true);
	}
	@Test
	public void modifyProject()
	{
		Reporter.log("modifyProject",true);
	}
	@Test
	public void deleteProject()
	{
		Reporter.log("deleteProject",true);
	}
}
