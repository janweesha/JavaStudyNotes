import javax.swing.*;
import java.math.*;


public class BigIntTset 
{
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("请输入彩球总数：");//输出一个简单的对话框
		int n= Integer.parseInt(input);//将字符串转换为整数
		input = JOptionPane.showInputDialog("请输入投注总数：");
		int m= Integer.parseInt(input);
		
		BigInteger option=BigInteger.valueOf(1);
		
		for(int i=0;i<m;i++)
		{
			//计算公式(n*(n-1)*(n-2)*...*(n-m+1))/(1*2*...*m)
			option = option.multiply(BigInteger.valueOf(n-i)).divide(BigInteger.valueOf(i+1));
		}
		System.out.println("你的中奖机会为每"+option+"次中一次！");
		//System.out.println(x);
		System.exit(0);
	}
}
