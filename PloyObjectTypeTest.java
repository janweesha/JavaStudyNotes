package package_2;

public class PloyObjectTypeTest {
	public static void main(String[] args)
	{
		//��������
		int a=10;
		long al=a;
		System.out.println(al);
		
		//��������
		A b=new B();
		b.method1();//���н����Method 1 in CLASS B
		//b.method2();//���л����
	}
}

class A
{
	public void method1()
	{
		System.out.println("Method 1 in CLASS A");
	}
}

class B extends A
{
	public void method1()
	{
		System.out.println("Method 1 in CLASS B");
	}
	
	public void method2()
	{
		System.out.println("Method 2 in CLASS B");
	}
}