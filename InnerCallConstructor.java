
public class InnerCallConstructor 
{
	public static void main(String[] args)
	{
		InnerCallConstructor ot=new InnerCallConstructor();
		Student2 s1=new Student2("Janwee","222015602063002");
		s1.setGender("Man");
		ot.print(s1);
	}
	
	public void print(Student2 s)
	{
		System.out.println("Name:"+s.getName()+"\nId:"+s.getId()+"\nGender:"+s.getGender());
	}
}
class Student2
{
	private String name="Not Input Yet";
	private String id="Not Input Yet";
	private String gender="Not Input Yet";
	
	public Student2(String n,String i,String g)
	{
		name=n;
		id=i;
		gender=g;
	}
	
	public Student2(String n)
	{
		this(n,"","");
	}
	
	public Student2(String n,String i)
	{
		this(n,i,"");
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