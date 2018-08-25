import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;


public class FormatInOutPut {
	public static void main(String[] args)
	{
		String strIn=JOptionPane.showInputDialog("Input a integer,please:");
		int x=Integer.parseInt(strIn);
		
		System.out.println("The value is:"+x);
		
		NumberFormat number=NumberFormat.getNumberInstance(Locale.CHINA);
		NumberFormat currency=NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat percent=NumberFormat.getPercentInstance(Locale.CHINA);
		
		System.out.println(number.format(x));
		System.out.println(currency.format(x));
		System.out.println(percent.format(x));
		
	}
}
