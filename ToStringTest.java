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
		String info="ѧ������="+name+",���֤��="+id;
		return info;
	}
	
	public ManType(String n,String i)
	{
		name=n;
		id=i;
	}
	
}
