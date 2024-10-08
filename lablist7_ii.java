class lablist7_ii
{
	public static void main(String args[])
	{
		try
	{
		
		int a=0;
		int b=5/a;
		
		System.out.println("The result is"+b);
		
		int[] c=new int[4];
		c[6]=7;
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Division by zero\n"+e);
	}
	
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Array Index Out Of Bounds"+e);
	}
	}
	
}

