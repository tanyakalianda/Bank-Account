/**
 * 
 * @author Tanya Kalianda
 * Bank Account
 */
public class BankAccount 
{
	private String name;
	
	private int accNum; 
	
	private double balance; 
	
	
	public BankAccount(String accountHolder, int accountNumber)
	{
		name = accountHolder;
		accNum = accountNumber;
		balance = 0;
	}
	
	public BankAccount(String accountHolder, int accountNumber, double b)
	{
		name = accountHolder;
		accNum = accountNumber;
		balance = b;
	}

	
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	public void withdrawal(double amount)
	{
		balance = balance - amount;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "balance: " + balance;
	}
}
