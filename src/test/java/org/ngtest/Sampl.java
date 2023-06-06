package org.ngtest;

import org.testng.annotations.Test;

public class Sampl {
	@Test(groups="smoke")
	 private void tc_6(){ 	
		    System.out.println("tc-6 ClassGroup");
}
	@Test(groups="reg")
	 private void tc_7(){ 	
		    System.out.println("tc-7 ClassGroup");
}
	@Test(groups="sanity")
	 private void tc_8(){ 	
		    System.out.println("tc-8 ClassGroup");
}
}
