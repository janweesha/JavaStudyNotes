package package_2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArraySort {
	public static void main(String[] args)
	{
		String inStr=JOptionPane.showInputDialog("�������������");
		String outStr=JOptionPane.showInputDialog("����Ҫ��Ĳ�������");
		int in=Integer.parseInt(inStr);//��������������������ת��Ϊint��
		int out=Integer.parseInt(outStr);
		
		int[] total =new int[in];//total�ǲ�������
		int[] get=new int[out];//get�ǳ�ȡ����
		
		int realLen=total.length;//len���ڳ�ȡ����
		
		for(int i=0;i<total.length;i++)
		{
			total[i]=i+1;
		}
		for(int i=0;i<get.length;i++)
		{
			//double x=Math.random()*len;
			int r=(int)(Math.random()*realLen);
			System.out.print("��ʣ"+(realLen)+"��");
			System.out.println(",���е�"+(r+1)+"����"+total[r]);
			get[i]=total[r];
			total[r]=total[realLen-1];
			realLen--;
		}
		Arrays.sort(get);
		System.out.print("��鵽�ˣ�");
		for(int i=0;i<get.length;i++)
		{
			System.out.print(get[i]+",");
		}
		System.exit(0);
	}
}
