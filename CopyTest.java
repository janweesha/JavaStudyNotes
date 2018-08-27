import java.util.Date;
import java.util.GregorianCalendar;

/*************************************************************************/
public class CopyTest 
{
	public static void main(String[] args)
	{
		Student1 janwee=new Student1("Janwee");
		Student1 janet=janwee;//��ַ����
		Student1 jane=(Student1)janwee.clone();//ǳ����
		Student1 jungle=(Student1)janwee.deepClone();//���
		
		janwee.setAddress("China");
		janet.setAddress("India");
		jane.setAddress("America");
		jungle.setAddress("England");
		janwee.setEntryDate(2018, 8, 27);
		jane.setEntryDate(1996, 10, 25);
		jungle.setEntryDate(2008, 8, 8);
		janwee.print();
		janet.print();
		jane.print();
		jungle.print();
	}
}
/*************************************************************************/
interface Person1 
{
	void setAddress(String a);
}
/*************************************************************************/

class Student1 implements Person1,Cloneable
{
	private String name="";
	private String address="";
	private GregorianCalendar entryDate=new GregorianCalendar();
	/*�˴�һ��Ҫ�ù��캯����ʼ��һ��GregorianCalendarʵ����
	�������ᱨ��ָ�����NullPointerException*/

	
	public Student1(String n)
	{
		name=n;
	}
	
	public void setAddress(String a)
	{
		address=a;
	}
	
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			return null;
		}
	}
	
	public Object deepClone()
	{
		try
		{
			Student1 c=(Student1)super.clone();
			c.entryDate=(GregorianCalendar)entryDate.clone();
			return c;
		}
		catch(CloneNotSupportedException e)
		{
			return null;
		}
	}
	
	public void setEntryDate(int y,int m,int d)
	{
		entryDate.set(y, m-1, d);
	}
	
	public Date getEntryDate()
	{
		Date d=new Date();
		d=entryDate.getTime();
		return d;
	}
	
	public void print()
	{
		String info="Name:"+name+"\nAddress:"+address;
		info+="\nEntryDate:";
		info+=getEntryDate();
		System.out.println(info+"\n");
	}
}
