
public class DynamicBindTest {
	public static void main(String[] args)
	{
		B1 b1=new B1();
		C1.method3(b1);
	}
}

class A1
{
	public void method1()
	{
		System.out.println("Method 1 in CLASS A1");
	}
}

class B1 extends A1
{
	public void method1()
	{
		System.out.println("Method 1 in CLASS B1");
	}
	
	public void method2()
	{
		System.out.println("Method 2 in CLASS B1");
	}
}

class C1
{
	public static void method3(A1 a)
	{
		a.method1();
	}
}