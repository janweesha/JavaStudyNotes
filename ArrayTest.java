package package_2;

public class ArrayTest {
	public static void main(String[] args)
	{
		int[] a;//define array a
		a=new int[100];//initialize array a
		
		int b[];//define array b
		
		int c[]=new int[100];//define and initialize array c
		
		ClassType[] aArray=new ClassType[20];//define and initialize a ClassType array
	}
	
	class ClassType
	{
		private int x;
		private int y;
		public ClassType(int i)
		{
			x=i;
		}
	}
}
