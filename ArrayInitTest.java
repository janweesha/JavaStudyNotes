package package_2;

public class ArrayInitTest
{
	public static void main(String[] args)
	{
		ArrayInitTest aTest=new ArrayInitTest();
		
		int[] a=new int[10];
		aTest.intPrint(a);
		
		String[] b=new String[10];
		aTest.strPrint(b);
		
		boolean[] c=new boolean[10];
		aTest.boolPrint(c);
	}
	
	public void intPrint(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.print("\n");
	}
	
	public void strPrint(String[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.print("\n");
	}
	
	public void boolPrint(boolean[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.print("\n");
	}
}
