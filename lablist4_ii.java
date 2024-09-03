class Bank
{	private double balance;

	void info()
	{
		System.out.println("Welocme to Swiss Bank");
	}
	
	void bankacc(double balance)
	{
		this.balance=balance;
	}
	
	double getBalance()
	{
		return balance;
	}
	
	double calculateInterest()
	{
		return balance*0.05;
	}
}

class checkbank extends Bank
{
	double calculateInterest()
	{
		return getBalance()*0.03;
	}
}

class addbalance extends Bank
{
	double calculateInterest()
	{
		return getBalance()*0.01;
	}
}

class withdrawbalance extends Bank
{
	double calculateInterest()
	{
		return getBalance()*0.04;
	}
}


class lablist4_iii
{
	public static void main(String args[])
	{
		
		checkbank b1 = new checkbank();

		b1.bankacc(2515);
		System.out.println("Checking Account Interest: " + b1.calculateInterest());
		b1.bankacc(1000);
		System.out.println("Adding amount  Account Interest: " + b1.calculateInterest());
		b1.bankacc(500);
		System.out.println("Withdrawing Amount Account Interest: " + b1.calculateInterest());
 

       
      
	}
}
