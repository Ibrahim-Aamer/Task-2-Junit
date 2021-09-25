import org.junit.*;
import static org.junit.Assert.*;

public class AmsTest 
{
	@Test
	public void testCheckBalance() 
	{
		user = new User("Ibrahim Aamer","04-03-00","0311-5623283","House 61, Strt 1, Sec B");
		
		acc = new CheckingAccount(user,1200);
		
		Float expectedResult = (float)1200;
		
		Float result = acc.checkBalance();
		
		Assert.assertEquals(expectedResult,result);
		
	}
	
	private Account acc;
	private User user;
}
