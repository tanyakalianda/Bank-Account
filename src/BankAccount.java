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
		balance = balance + amount; //balance += amount;
	}
	public void withdrawal(double amount)
	{
		balance = balance - amount; //balance -= amount;
	}
	public double getBalance()
	{
		return balance;
	}
	public String toString()
	{
		return "Name: " + name + " Account Number: " + accNum + " Balance: " + balance;
		//return "/taccNum " -> /t is a tab (instead of leaving space b/w code + quotation mark)
		//return name;
		//return balance; 
		//return  accNum; -> this does't work b/c method ends after return -> only returns name
		//must return all on one string for all the fields to show up
	
	}
}
