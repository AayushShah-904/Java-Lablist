class distance
{	int feet,inch;

	 // Default constructor
	distance()
	{
		
		System.out.println("The distance in feet is "+1);
		System.out.println("The distance in inch is "+1);
		
	}
	
	// Parameterized constructor
	public void distance(int feet,int inch)
	{
		System.out.println("This is parameterized construtor using this keyword");
		this.feet=feet;
		this.inch=inch;
		System.out.println("The distance in feet is "+feet);
		System.out.println("The distance in inch is "+inch);
		
	}
	
}
class lablist3_iv
{
	public static void main(String args[])
	{
		distance d=new distance();
		d.distance(4,5);
	}
}

