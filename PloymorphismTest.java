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
		public Student4(String n,String i,String g)//���캯��(����ͬ��)
		{
			id=i;
			name=n;
			gender=g;
		}
		public String getName()//��ȡ����
		{
			return name;
		}
		public void setName(String n)//��������
		{
			name=n;
		}
		public String getId()//��ȡID
		{
			return id;
		}
		public String getGender()//��ȡ�Ա�
		{
			return gender;
		}
		public void setGender(String g)//�����Ա�
		{
			gender=g;
		}
		public void setId(String i)//����id
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
	public Manager(String n,String i,String g,String j)//���캯��(����ͬ��)
	{
		super(n,i,g);
		job=j;
	}
	
}

