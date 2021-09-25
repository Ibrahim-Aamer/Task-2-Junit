import java.util.Date;

public class Account 
{
	public Account() 
	{
		
	}
	
	/**
	 * Constructs a new account object (Parameterized constructor)
	 * @param username,
	 */
	public Account(User user, int initDeposit) 
	{
		NumCnt = NumCnt + 1; //incrementing account no# at each new creation
		
		accountNum = NumCnt; //Assigning NumCnt to accountNum
		
		dateCreated = new Date();//Getting system date and time
		
		Name = user.getName();  //Getting user name from user object
		
		balance = initDeposit;//setting initial deposit	
		
	}
	
	/**
	 * 
	 * @return String Name & balance
	 */
	public float checkBalance() 
	{
		
		return this.balance;
	}
	

	
	
	public void transferAmount(float amount, int accountNum) 
	{
		
	}
	
	/**
	 * 
	 * @param transactionAmount
	 * @return returns string which holds transaction details
	 */
	public String printStatement(float transactionAmount) 
	{
		Date transactionTime = new Date();
		
		String ret = "--------------------------------------------------\n"
						  + "              TRANSACTION STATEMENT\n"
				           +"-------------------------------------------------\n"
				+ "Account Number     : " + Integer.toString(accountNum) + '\n'
			+  "Transaction Amount : " + Float.toString(transactionAmount) + '\n'
			+  "Remaining Balance  : " + Float.toString(balance) + '\n'
			+  "Transaction Time   : " + transactionTime + '\n' 
			+  user.displayDetails() + '\n'
		    +  "--------------------------------------------------\n"	;
			
			return ret;
			
	}
	
	public void makeDeposit(float deposit) 
	{
	}

	public void makeWithdrawal(float amount) 
	{
	}
	
	/**
	 * Function to be overridden
	 */
	public float displayAllDeductions() 
	{
		return 0;
	}
	
	
	/**
	 * Returns account number
	 * @return Account number 
	 */
	public int getAccountNum() 
	{
		return accountNum;
	}

	static protected int NumCnt = 0;
	protected int accountNum;
	protected String Name;
	protected float balance;
	protected Date dateCreated;
	protected User user; //user object to hold user details
	protected float totalDeductions = 0;
	
}





