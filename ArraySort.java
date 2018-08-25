package package_2;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class ArraySort {
	public static void main(String[] args)
	{
		String inStr=JOptionPane.showInputDialog("输入彩球总数：");
		String outStr=JOptionPane.showInputDialog("输入要抽的彩球数：");
		int in=Integer.parseInt(inStr);//将在输入框中输入的数字转换为int型
		int out=Integer.parseInt(outStr);
		
		int[] total =new int[in];//total是彩球总数
		int[] get=new int[out];//get是抽取数量
		
		int realLen=total.length;//len等于抽取数量
		
		for(int i=0;i<total.length;i++)
		{
			total[i]=i+1;
		}
		for(int i=0;i<get.length;i++)
		{
			//double x=Math.random()*len;
			int r=(int)(Math.random()*realLen);
			System.out.print("还剩"+(realLen)+"个");
			System.out.println(",抽中第"+(r+1)+"个："+total[r]);
			get[i]=total[r];
			total[r]=total[realLen-1];
			realLen--;
		}
		Arrays.sort(get);
		System.out.print("你抽到了：");
		for(int i=0;i<get.length;i++)
		{
			System.out.print(get[i]+",");
		}
		System.exit(0);
	}
}
