
public class StringBufferTest {
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer();
		sb.append("com.sun.java.lang");
		System.out.println(sb);
		System.out.println(sb.charAt(5));
		sb.setCharAt(5, 'o');
		System.out.println(sb);
		System.out.println(sb.reverse());
	}
}
