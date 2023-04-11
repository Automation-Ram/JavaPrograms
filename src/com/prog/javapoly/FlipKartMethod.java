package com.prog.javapoly;

public class FlipKartMethod extends AmazonMethod {
	
	public void methodTable(int amount)

	{
		System.out.println("MethodPEN");
	}
	public void methodSoap(int num,String name)

	{
		System.out.println("MethodPEN");
	}

	public static void main(String[] args) {
		FlipKartMethod obj=new FlipKartMethod();
		obj.methodpen();
		obj.methodphone(20000);
		obj.methodSoap(101, "LUX");
		obj.methodTable(30000);

	}

}
