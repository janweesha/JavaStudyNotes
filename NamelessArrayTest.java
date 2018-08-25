package package_2;

public class NamelessArrayTest {
	public static void main(String[] args)
	{
		NamelessArrayTest aTest=new NamelessArrayTest();
		int[] a={1,2,3};
		aTest.intPrint(a);
		a=new int[]{1,2,3,4,5,6,7};
		aTest.intPrint(a);
	}
	
	public void intPrint(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.print("\n");
	}
}
