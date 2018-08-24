
public class ObjectTest {
	public static void main(String[] args)
	{
		String object_1="Hello";
		String object_2=new String("World!");
		ObjectTest object_3=new ObjectTest();//把类作为对象使用
		object_3.print();
		System.out.print(object_1+" ");
		System.out.print(object_2);
	}
	public void print()
	{
		System.out.println("打印内容：");
	}
}
