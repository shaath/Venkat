package com.SeleniumProject.javaprogrammes;

public class InheritanceChild extends MethodsEg
{

	public static void main(String[] args) 
	{
		Function1();

		String res= Function2();
		System.out.println(res);
		
		MethodsEg m=new MethodsEg();
		m.Function1();
	}

	public static void Function1()
	{
		System.out.println("Venkat1");
	}
	public static String Function2()
	{
		System.out.println("Venkat2");
		return "Pass";
	}
}
