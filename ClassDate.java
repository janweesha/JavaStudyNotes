import java.util.Date;

public class ClassDate 
{
	private Date today=new Date();//�Ǳ��ض�������ĳ�ʼ������Ҫ��ʽ�ĶԱ������г�ʼ��
	
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
