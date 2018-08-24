
public class ShortCircuit {
	public static void main(String[] args){
		ShortCircuit a=new ShortCircuit();
		if(a.test1(0)&&a.test2(2)&&a.test3(2)){
			System.out.println("结果为true");
		}
		else
		{
			System.out.println("结果为false");
		}
	}
	public boolean test1(int var1){
		System.out.println("test1("+var1+")");
		System.out.println("result:"+(var1<1));
		return var1<1;
	}
	public boolean test2(int var2){
		System.out.println("test1("+var2+")");
		System.out.println("result:"+(var2<2));
		return var2<2;
	}
	public boolean test3(int var3){
		System.out.println("test1("+var3+")");
		System.out.println("result:"+(var3<2));
		return var3<2;
	}

}
