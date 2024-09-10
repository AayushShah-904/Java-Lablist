import java.util.*;

abstract class Shape
{
	Scanner sc=new Scanner(System.in);
	abstract void area();
 
}

class Triangle extends Shape
{
	void area()
	{
		int h,l;
		System.out.println("Enter lenght and height of triangle ");
		h=sc.nextInt();
		l=sc.nextInt();
	
		
		System.out.println("Area of triangle " + (0.5*h*l));
	}
}

class Rectangle extends Shape
{
	void area()
	{
		int l,b;
		System.out.println("Enter lenght and width of rectangle ");
		b=sc.nextInt();
		l=sc.nextInt();
		System.out.println("Area of rectangle " + (l*b));
	}
}

class Circle extends Shape
{
	void area()
	{
		int r;
		System.out.println("Enter radius of circle ");
		r=sc.nextInt();
		System.out.println("Area of circle " + (3.17*r*r));
	}
}

class lablist6_i
{
	public static void main(String args[])
	{
		Triangle t=new Triangle();
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		
		System.out.println("Area of triangle " + t.area());
		System.out.println("Area of rectangle " + r.area());
		System.out.println("Area of circle " + c.area());
			
	}
}