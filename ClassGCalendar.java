import java.util.*;

public class ClassGCalendar {
	public static void main(String[] args)
	{
		ClassGCalendar  gCalendar=new ClassGCalendar();
		gCalendar.print();
	}
	public void print()
	{
		//Calendar calendar=new GregorianCalendar();//GregorianCalendar¼Ì³Ð×ÔCalendarÀà
		Calendar calendar=new GregorianCalendar();
		Date trialTime=new Date();
		calendar.setTime(trialTime);
		System.out.println(calendar);
		System.out.println("This Year Is:"+calendar.get(Calendar.YEAR));
		System.out.println("This Month Is:"+calendar.get(Calendar.MONTH)+"+1");
		System.out.println("Today Is:"+calendar.get(Calendar.DAY_OF_MONTH));
	}
}
