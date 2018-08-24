
public class BreakContinueTest {
	public static void main(String[] args){
		for(int i=1;i<20;i++){
			if(i==10)
				break;
			System.out.println("  "+i);
		}
		System.out.println("\n 循环结束！");
		
		for(int j=1;j<20;j++){
			if(j%2==0)
				continue;
			System.out.println("  "+j);
		}
		System.out.println("\n 循环结束！");
	}
}
