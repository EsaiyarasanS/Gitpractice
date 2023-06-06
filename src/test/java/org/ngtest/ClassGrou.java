package org.ngtest;

import org.testng.annotations.Test;

public class ClassGrou {
	@Test(groups="smoke")
	 private void tc_1(){ 	
		    System.out.println("tc-1 ClassGroup");
}
	@Test(groups="reg",dependsOnGroups="smoke")
	 private void tc_2(){ 	
		    System.out.println("tc-2 ClassGroup");
}
	@Test(groups="sanity",dependsOnGroups="reg")
	 private void tc_3(){ 	
		    System.out.println("tc-3 ClassGroup");
}
	@Test(groups="smoke")
	 private void tc_4(){ 	
		    System.out.println("tc-4 ClassGroup");
}
	@Test(groups="sanity")
	 private void tc_5(){ 	
		    System.out.println("tc-5 ClassGroup");
}
	 
}
