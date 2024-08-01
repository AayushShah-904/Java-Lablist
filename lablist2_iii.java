import java.util.*;

class lablist2_iii
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Enter first number ");
		a=sc.nextInt();
		System.out.println("Enter second number ");
		b=sc.nextInt();
		System.out.println("Enter third number ");
		c=sc.nextInt();
		
		if(a==b & b==c & c==a)
		{
			System.out.println("All numbers are equal");
		}
		else if(a>b & a>c)
		{
			System.out.println("A is maximun");
		}
		
		else if(b>a & b>c)
		{
			System.out.println("B is maximun");
		}
		
		else if(c>a & c>b)
		{
			System.out.println("C is maximun");
		}
		else
		{
			System.out.println("Enter numbers properly");
		}
	}
}