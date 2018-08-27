
public class InterfaceTest {
	public static void main(String[] args)
	{
		StudentC frodo=new StudentC("Frodo","Male","19961025");
		StudentC sam=new StudentC("Sam","Male","19960914");
		StudentC aragon=new StudentC("Aragon","Male","19961025");
		System.out.println(frodo.compareTo(sam));
		System.out.println(frodo.compareTo(aragon));
	}
}

interface PersonC {
	String getName();//接口方法无需声明访问控制符，默认public
	String getGender();//接口无实例字段
	String getBirth();
	String getAddress();
	void setAddress(String a);
}

class StudentC implements PersonC,Comparable
{
	private String name;
	private String gender;
	private String birth;
	private String address;
	
	public StudentC(String n,String g,String b)
	{
		name=n;
		gender=g;
		birth=b;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String getBirth()
	{
		return birth;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String a)
	{
		address=a;
	}
	
	public int compareTo(Object otherObj)
	{
		StudentC other=(StudentC)otherObj;
		int otherBirth=Integer.parseInt(other.getBirth());
		int thisBirth=Integer.parseInt(birth);
		
		if (thisBirth>otherBirth)
			return -1;
		else if(thisBirth==otherBirth)
			return 0;
		else
			return 1;
	}
}

