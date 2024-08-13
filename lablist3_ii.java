import java.util.*;

class distance
{
	distance()
	{
		int feet,inch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in feet");
		feet=sc.nextInt();
		System.out.println("Enter the distance in inch");
		inch=sc.nextInt();
		
		System.out.println("The distance in feet is "+feet);
		System.out.println("The distance in inch is "+inch);
		
	}
	void distance1(int feet1,int inch1)
	{
		System.out.println("The distance in feet is "+feet1);
		System.out.println("The distance in inch is "+inch1);
		
	}
	
	void distance2(int feet2,int inch2)
	{
		System.out.println("The distance in feet is "+feet2);
		System.out.println("The distance in inch is "+inch2);
		
	}
	
	
}



class lablist3_ii
{
	public static void main(String args[])
	{
		//distance d=new distance();
		distance d1=new distance();
		distance d2=d1;
		d1.distance1(4,5);
		d2.distance2(6,7);
	}
}

