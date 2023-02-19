package TextNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsOn {
	
	@Test
public void sendRequest() {
	System.out.println("Sending friend request");
	Assert.assertTrue(false);

}
	@Test(dependsOnMethods ="sendRequest" )
public void acceptRequest() {
	System.out.println("accepting friend request");
	
}


}
