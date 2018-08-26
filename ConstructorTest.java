
public class ConstructorTest
{
	public static void main(String[] args)
	{
		C c=new C();
		c.print();
	}
}

class A
{
	public A()
	{
		System.out.println("This is Constructor of class A");
	}
	public void print()
	{
		System.out.println("This is function print in A");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("This is Constructor of class B");
	}
	
	public void print()
	{
		System.out.println("This is function print in B");
	}
}

class C extends B
{
	public C()
	{
		System.out.println("This is Constructor of class C");
	}
	public void print()
	{
		System.out.println("This is function print in C");
	}
}
