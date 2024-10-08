class lablist7_iii
{
	public static void main(String args[])
	{
		try
		{
			// Outer try block
			System.out.println("Outer try block started");
			
			try
			{
				// Inner try block
				System.out.println("Inner try block started");
				int[] c=new int[4];
				c[6]=7;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				// Catching ArithmeticException in inner try block
				System.out.println("Array Index Out Of Bounds"+e);
			}
			int a=0;
			int b=5/a;
		
			System.out.println("The result is"+b);
			System.out.println("Outer try block ended");
		}
		
	
		catch(ArithmeticException e)
		{
			// Catching any other exception in outer try block
			System.out.println("Division by zero"+e);
		}
	
	}
	
}


