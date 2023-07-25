package com.actitime.testscript;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

@Listeners(com.actitime.generic.ListenerImplementation.class)
public class Excecute extends BaseClass {
@Test
public void actitimelogin()
{
	Reporter.log("successfully logout from actitime", true);
	Assert.fail();
}
}
