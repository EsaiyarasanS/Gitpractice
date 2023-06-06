package org.myname;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hello {

	@BeforeSuite
    private void tc_1(){
    	
    System.out.println("tc-1 before suit");
    }
	@AfterSuite
	private  void tc_2(){
		
		System.out.println("tc-2 after suit");
	}
@BeforeTest
private  void tc_3(){
		
		System.out.println("tc-3 before test");
	}
@AfterTest
	private  void tc_4(){
		
		System.out.println("tc-4 after tst");
	}
@BeforeClass
private  void tc_5(){
		
		System.out.println("tc-5 before class");
	}
@AfterClass 
private  void tc_6(){
	
	System.out.println("tc-6 after class");
}
@BeforeMethod
private  void tc_7(){
	
	System.out.println("tc-7 before method");
}
@AfterMethod
private  void tc_8(){
	
	System.out.println("tc-8 after method");
}
@Test
private  void tc_9(){
	
	System.out.println("tc-9 test");
}

	
}
