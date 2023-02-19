package TextNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	@Test
  public void m1() {
	  System.out.println("m1");
  }
	@BeforeSuite
	public void beforeSuite() {
		 System.out.println("suite");
	}
	@BeforeTest
	public void beforeTest() {
		 System.out.println("test");
	}
	@BeforeClass
	public void beforeClass() {
		 System.out.println("class ");
	}
	@BeforeMethod
	public void beforeMethod() {
		 System.out.println("method");
	}
	



}
