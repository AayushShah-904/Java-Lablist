interface Shape
{
	void getArea();
}

class Triangle implements Shape
{
	void getArea(int h,int l)
	{		
		return 0.5*h*l;
	}
}

class Rectangle implements Shape
{
	void getArea(in l,int b)
	{
		return l*b;
	}
}

class Circle implements Shape
{
	int getArea(int r)
	{
		return 3.14*r*r;
	}
}

class lablist6_iii
{
	public static void main(String args[])
	{
		Triangle t=new Triangle(3,5);
		Rectangle r=new Rectangle(6,2);
		Circle c=new Circle(5);
		
		System.out.println("Area of triangle" + t.getArea());
		System.out.println("Area of rectaangle" + r.getArea());
		System.out.println("Area of circle" + c.getArea());
			
	}
}