class lablist7_i
{
	public static void main(String args[])
	{
		try
	{
		int a=0;
		int b=5/a;
		
		System.out.println("The result is"+b);
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Division by zero");
	}
	}
	
}