import java.util.*;


class bank
{
	
	int balance;
	
	void deposit(int balance)
	{
		this.balance=balance;
	}
	
	public void withdraw(int amount) throws InsufficientFundsException
	{
		
		
			if(amount>this.balance)
			{
				throw new InsufficientFundsException("Not sufficient fund");
			}
			this.balance-=amount;
			System.out.println("Withdraw Rs: " + amount + " New balnce Rs: " + this.balance );
		
	}
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class lablist7_iv
{
	public static void main(String args[])
	{
			bank b =new bank();
			b.deposit(1000);
			try
			{
				b.withdraw(400);
				b.withdraw(300);
				b.withdraw(500);
			}
			catch(InsufficientFundsException e)
			{
				System.out.println(e);
			}
	
	}
}


