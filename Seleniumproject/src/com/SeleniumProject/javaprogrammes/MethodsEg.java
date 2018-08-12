package com.SeleniumProject.javaprogrammes;

public class MethodsEg {

	public static void main(String[] args) 
	{
		Function1();
		String res=Function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		m.Function3();
		boolean flag=m.Function4();
		System.out.println(flag);
	}

	//Static Method Without returning value
	public static void Function1()
	{
		System.out.println("This is Function1 code");
	}
	
	//static method with return Value
	public static String Function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	//Non static Method without returning any value
	public void Function3()
	{
		System.out.println("This is Function3 code");
	}
	//Non static method with returning value
	public boolean Function4()
	{
		System.out.println("This is Function4 code");
		return true;
	}
	
	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
	
	public int sum(int a,int b,int c)
	{
		int d=a+b+c;
		return d;
	}
	
}
