class Bank
{	
	
}

class BankAcc extends Bank
{
	int no;
	void info(int no)
	{
		this.no=no;
		System.out.println("Acc number is "+no);
	}
	
}

class BankName extends BankAcc
{
	
	void info()
	{
		
		System.out.println("Info is raj" );
		super.info(741852963);
	}
}

class BankDetails extends BankName
{
	int cash;
	void info(int cash)
	{
		this.cash=cash;
		System.out.println("Bank details are savings " +cash+" rupess" );
		super.info();
	}
	
}

class lablist4_ii
{
	public static void main(String args[])
	{
		BankDetails b=new BankDetails();
		b.info(76543);
	}
}