/**
 * 
 * @author Tanya Kalianda
 * Bank Account Main
 */
public class BankAccountMain
{
	private static String Tanya;
	
	public static void main(String[] args) 
	{
	BankAccount account1 = new BankAccount(Tanya, 548385, 0);
	System.out.println(account1.getBalance());
	
	account1.deposit(500);
	account1.withdrawal(25);
	System.out.println(account1.getBalance());
	
	System.out.println(account1.toString());
	}

}
