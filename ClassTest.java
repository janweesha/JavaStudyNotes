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
		public Student3(String i)//���캯��(����ͬ��)
		{
			id=i;
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
			String info="Name:"+name+"\nId:"+id+"\nGender:"+gender;
			return info;
		}
		
		
	}