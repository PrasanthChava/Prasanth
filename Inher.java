package no;

public class Inher extends Inher2{
	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inher2 a=new Inher2();
		a.add(10,20);
		sub(10,20);
	}

}
