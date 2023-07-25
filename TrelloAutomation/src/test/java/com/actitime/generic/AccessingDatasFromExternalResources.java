package com.actitime.generic;

import java.io.IOException;

public class AccessingDatasFromExternalResources {
public static void main(String[] args) throws IOException {
	UsageOfGenericMethods use=new UsageOfGenericMethods();
	System.out.println(use.getDataFromProperty("url"));
	System.out.println(use.readDataFromExcel("myinfo", 2, 1));
	use.writeDataFromExcel("myinfo", 2, 1, "madurai");
}
}
