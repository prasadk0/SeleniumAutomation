package TextNG;

import org.testng.annotations.Test;

public class SequencingPriority {
	@Test
	public void a1() {
		 System.out.println("a1");
	}
	@Test(priority = 4)
	public void banana1() {
		
		System.out.println("banan1");
	}
	@Test(priority = -1)
	public void chickoo1() {
		 System.out.println("chickko1");
	}
	@Test(priority = -1)
	public void abc1() {
		 System.out.println("abc1");
	}
	

}
