package no;

public class Cast1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="102";
		int n=8;
		String s1=Integer.toString(n);
		s1=s1.replaceAll("//D+","");
		int x=Integer.parseInt(s);
		System.out.println(x+10);
	}

}
