
public class OverloadTest 
{
	public static void main(String[] args)
	{
		OverloadTest ot=new OverloadTest();
		Student1 s1=new Student1("Janwee","222015602063002","Woman");
		s1.setGender("Man");
		ot.print(s1);
	}
	
	public void print(Student1 s)
	{
		System.out.println("Name:"+s.getName()+"\nId:"+s.getId()+"\nGender:"+s.getGender());
	}
}
class Student1
{
	private String name="Not Input Yet";
	private String id="Not Input Yet";
	private String gender="Not Input Yet";
	
	public Student1(String n)//define the constructor
	{
		name = n;
	}
	
	public Student1(String n,String i)//overload the constructor
	{
		name=n;
		id=i;
	}
	
	public Student1(String n,String i,String g)
	{
		name=n;
		id=i;
		gender=g;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public void setGender(String g)
	{
		gender=g;
	}
}