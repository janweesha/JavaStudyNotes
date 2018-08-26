package package_2;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args)
	{
		ArrayList<Person> people=new ArrayList<Person>();
		people.ensureCapacity(100);//为ArrayList分配固定容量
		
		System.out.println(people.size());
		
		people.add(new Person("Jane","001"));
		people.add(new Person("Jerry","002"));
		people.add(new Person("Janwee","003"));
		
		System.out.println(people.size());
		
		ArrayListTest alt=new ArrayListTest();
		alt.arrayPrint(people);
	}
	
	public void arrayPrint(ArrayList<Person> al)
	{
		for(int i=0;i<al.size();i++)
		{
			Person p=(Person)al.get(i);//强制类型转换
			System.out.println(p.getInfo());//用Person.getInfo()获取私有变量
		}
}
}
	
class Person
{
	private String name="";
	private String id="";
	private String gender="";
	
	public Person(String n,String i,String g)
	{
		id=i;
		name=n;
		gender=g;
	}
	
	public Person(String n,String i)//类内调用构造器
	{
		this(n,i,"");
	}
	
	public Person(String n)//类内调用构造器
	{
		this(n,"","");
	}
	
	public String getInfo()
	{
		String info="Name:"+name+"\tId:"+id+"\tGender:"+gender;
		return info;
	}
}
