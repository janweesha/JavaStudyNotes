/* *
A.	void add(int index,Object element)//在index位置增加一个元素element
B.	boolean add(Object element)//在末尾追加元素element
C.	boolean contains(Object element) //测试列表中是否包含element元素
D.	int size()//返回数组元素数量size
E.	void set(int index,Object obj)//修改index处的值为obj
F.	Object get(int index)//获取index位置的值
G.	Object remove(int index)//删除index位置的值

 */
package package_2;

import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args)
	{
		IntArrayList al=new IntArrayList();
		for (int i=0;i<10;i++)
		{
		al.add(i+1);
		}
		al.add(10, 11);
		al.set(9, 11);
		al.remove(0);
		
		MainTest mt=new MainTest();
		mt.print(al);
		
		System.out.println(al.contains(10));
		System.out.println(al.size());
	}
	
	public void print(IntArrayList al)
	{
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+",");
		}
		System.out.print("\n");
	}
}

class IntArrayList {
	
	private ArrayList<Integer> list;
	
	public IntArrayList()//默认构造器
	{
		list=new ArrayList<Integer>();
	}
	
	public boolean add(int i)//boolean add(Object element)
	{
		return list.add(i);
	}
	
	public void add(int i,int j)//void add(int index,Object element)
	{
		list.add(i,j);
	}
	
	public boolean contains(int i)//boolean contains(Object element)
	{
		return list.contains(i);
	}
	
	public int size()//int size()
	{
		return list.size();
	}
	
	public void set(int i,int j)//void set(int index,Object obj)
	{
		list.set(i, j);
	}
	
	public int get(int i)//Object get(int index)
	{
		return (int)list.get(i);
	}
	
	public int remove(int i)//Object remove(int index)
	{
		return (int)list.remove(i);
	}
}
