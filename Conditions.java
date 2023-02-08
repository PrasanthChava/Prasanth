package no;

import java.util.Scanner;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,m;
		System.out.print("Enter first num");
		n=sc.nextInt();
		System.out.print("Enter second num");
		m=sc.nextInt();
		if(n>m)
		{
			System.out.println("First num is larger than second");
		}
		else if(m>n)
		{
			System.out.println("Second num is larger than First");
		}
		else
		{
			System.out.println("Both are equal");
		}
	}

}
