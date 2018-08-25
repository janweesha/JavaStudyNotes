package package_2;

public class ToStringTest {
	public static void main(String[] args)
	{
		ManType man=new ManType("Janwee","222015602063002");
		System.out.println(man);
	}
}

class ManType
{
	private String name;
	private String id;
	
	public String toString()
	{
		String info="学生姓名="+name+",身份证号="+id;
		return info;
	}
	
	public ManType(String n,String i)
	{
		name=n;
		id=i;
	}
	
}
