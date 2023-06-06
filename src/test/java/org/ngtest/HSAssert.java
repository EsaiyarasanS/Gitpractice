package org.ngtest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HSAssert {
	@Test
private void tc_01() {
	System.out.println("tc_01()");
}
	@Test
private void tc_02() {
		System.out.println(1);
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(false);
	System.out.println("tc_02()");
	System.out.println("tc_03()");
	sa.assertAll();
	System.out.println("tc_04()");
	System.out.println("tc_05()");
	
}
	@Test
private void tc_03() {
	System.out.println("tc_06()");

	
}
	
}
