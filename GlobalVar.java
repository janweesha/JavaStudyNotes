
public class GlobalVar {
	//�ڷ�������������ȫ�ֱ���
	byte a;
	short b;
	int c;
	long d;
	char e;
	float f;
	double g;
	boolean h;
	
	public static void main(String[] args){
		GlobalVar aInit=new GlobalVar();//����һ����ΪaInit��GlobalVarʵ��
		aInit.print();
	}
	public void print(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

}
