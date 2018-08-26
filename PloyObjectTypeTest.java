package package_2;

public class PloyObjectTypeTest {
	public static void main(String[] args)
	{
		//基本类型
		int a=10;
		long al=a;
		System.out.println(al);
		
		//对象类型
		A b=new B();
		b.method1();//运行结果：Method 1 in CLASS B
		//b.method2();//运行会出错
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