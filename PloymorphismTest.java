package package_2;

public class PloymorphismTest{
	
	public static void main(String[] args)
	{
		Student4 tom=new Student4("Janwee","001","Man");
		tom.setName("Janwee");
		tom.setGender("Man");
		tom.setId("001");
		System.out.println(tom.toString());
		
		Manager jerry=new Manager("Jerry","002","Man","Monitor");
		System.out.println(jerry.toString());
		
		Student4 jane;
		jane=new Manager("Jane","003","Woman","StudyManager");
		System.out.println(jane.toString());
	}
}

class Student4
	{
		private String name="";
		private String id="";
		private String gender="";
		public Student4(String n,String i,String g)//构造函数(与类同名)
		{
			id=i;
			name=n;
			gender=g;
		}
		public String getName()//获取名字
		{
			return name;
		}
		public void setName(String n)//设置姓名
		{
			name=n;
		}
		public String getId()//获取ID
		{
			return id;
		}
		public String getGender()//获取性别
		{
			return gender;
		}
		public void setGender(String g)//设置性别
		{
			gender=g;
		}
		public void setId(String i)//设置id
		{
			id=i;
		}
		public String toString()
		{
			String info="Name:"+name+"\tId:"+id+"\tGender:"+gender;
			return info;
		}
			
	}

class Manager extends Student4
{
	private String job="";
	
	public String getJob()
	{
		return job;
	}
	
	public void setJob(String j)
	{
		job=j;
	}
	
	public String toString()
	{
		String str=super.toString();
		str+="\tJob:"+job;
		return str;
	}
	public Manager(String n,String i,String g,String j)//构造函数(与类同名)
	{
		super(n,i,g);
		job=j;
	}
	
}

