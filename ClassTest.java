public class ClassTest {
	
	public static void main(String[] args)
	{
		Student3 tom=new Student3("522225199609144438");
		tom.setName("Janwee");
		tom.setGender("Man");
		tom.setId("522225199609144438");
		System.out.println(tom.toString());
		
	}
}

class Student3
	{
		private String name="";
		private String id="";
		private String gender="";
		public Student3(String i)//构造函数(与类同名)
		{
			id=i;
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
			String info="Name:"+name+"\nId:"+id+"\nGender:"+gender;
			return info;
		}
		
		
	}