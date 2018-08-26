package package_2;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args)
	{
		ArrayList<Person> people=new ArrayList<Person>();
		people.ensureCapacity(100);//ΪArrayList����̶�����
		
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
			Person p=(Person)al.get(i);//ǿ������ת��
			System.out.println(p.getInfo());//��Person.getInfo()��ȡ˽�б���
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
	
	public Person(String n,String i)//���ڵ��ù�����
	{
		this(n,i,"");
	}
	
	public Person(String n)//���ڵ��ù�����
	{
		this(n,"","");
	}
	
	public String getInfo()
	{
		String info="Name:"+name+"\tId:"+id+"\tGender:"+gender;
		return info;
	}
}
