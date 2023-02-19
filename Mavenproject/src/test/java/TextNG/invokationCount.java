package TextNG;

import org.testng.annotations.Test;

public class invokationCount {
	
	@Test(invocationCount = 4)
	public void tc1() {
		System.out.println("Tc1 passed");
	}

}
