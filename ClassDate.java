import java.util.Date;

public class ClassDate 
{
	private Date today=new Date();//非本地对象变量的初始化，需要显式的对变量进行初始化
	
	public static void main(String[] args)
	{
		ClassDate d=new ClassDate();
		d.print();
	}
	public void print()
	{
		//Date today=new Date();
		String td=today.toString();
		System.out.println(td);
	}
}
