package package_2;

public class CommandParaTest {
	public static void main(String[] args)
	{
		if(args.length==0)
		{
			System.out.print("Process exited with no input!");
		}
		else
		{
			System.out.print("You have input "+args.length+" parameter");
		}
	}
}
