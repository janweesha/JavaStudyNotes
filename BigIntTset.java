import javax.swing.*;
import java.math.*;


public class BigIntTset 
{
	public static void main(String[] args)
	{
		String input = JOptionPane.showInputDialog("���������������");//���һ���򵥵ĶԻ���
		int n= Integer.parseInt(input);//���ַ���ת��Ϊ����
		input = JOptionPane.showInputDialog("������Ͷע������");
		int m= Integer.parseInt(input);
		
		BigInteger option=BigInteger.valueOf(1);
		
		for(int i=0;i<m;i++)
		{
			//���㹫ʽ(n*(n-1)*(n-2)*...*(n-m+1))/(1*2*...*m)
			option = option.multiply(BigInteger.valueOf(n-i)).divide(BigInteger.valueOf(i+1));
		}
		System.out.println("����н�����Ϊÿ"+option+"����һ�Σ�");
		//System.out.println(x);
		System.exit(0);
	}
}
