class A 
{
    void da() 
	{
        System.out.println("This is class A method");
    }
}

class B extends A 
{
    void db() 
	{
        System.out.println("This is class B method");
		System.out.println("Single Inheritance");
    }
}

class C 
{
    void dc() 
	{
        System.out.println("This is class C method");
		System.out.println("Multilevel Inheritance");
    }
}

class D extends C
{
    void dd() 
	{
        System.out.println("This is class D method");
		System.out.println("Multilevel Inheritance");
    }
}

class E extends D
{
    void de() 
	{
        System.out.println("This is class E method");
		System.out.println("Multilevel Inheritance");
    }
}

class F extends A
{
    void df() 
	{
        System.out.println("This is class F method");
		System.out.println("Hierarchhical Inheritance super class A");
    }
}

class G extends A
{
    void dg() 
	{
        System.out.println("This is class G method");
		System.out.println("Hierarchhical Inheritance superclass A");
    }
}

class lablist4_i 
{
    public static void main(String[] args) 
	{
		
		B b1=new B();
		b1.db();
		b1.da();
		
		System.out.println(" ");
		
		
		E e1=new E();
		e1.dc();
		e1.dd();
		e1.de();
		
		System.out.println(" ");
		
		
		F f1=new F();
		f1.df();
		
		G g1=new G();
		g1.dg();
				
		
		
       
		
		
    }
}