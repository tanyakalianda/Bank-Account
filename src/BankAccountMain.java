/**
 * 
 * @author Tanya Kalianda
 * Bank Account Main
 */
public class BankAccountMain
{
	
	public static void main(String[] args) 
	{
	BankAccount account1 = new BankAccount("Tanya", 548385);
	System.out.println(account1.getBalance());
	
	BankAccount account2 = new BankAccount("Tanya", 548385, 250);
	System.out.println(account2.getBalance());
	
	account1.deposit(500);
	account1.withdrawal(25);
	System.out.println(account1.getBalance());
	
	System.out.println(account1.toString());
	}

}
