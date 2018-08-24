
public class LabeledFor {
	public static void main(String[] args){
		outer:
			for(int i=0;i<5;i++)
			{
				System.out.println("i="+i);
				inner:
				for(int j=0;j<3;j++)
				{
					System.out.println("j="+j);
					if (j%2 == 0)//when j is a even
					{
						continue inner;
					}
					if (i % 2==0)//when i is a odd
					{
						continue outer;
					}
					if(i==3){
						break outer;
					}
					
				}
			}
	System.out.println("This is all over");
	}
}
