package no;

public class Pen {
	String type="gel";
	String color="blue";
	int len=10;
	static boolean clicked=false;
	public  void click()
	{
		clicked=true;
	}
	public static void unclick()
	{
		clicked=false;
	}
}
