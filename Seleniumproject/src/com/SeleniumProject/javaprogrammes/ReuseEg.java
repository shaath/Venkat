package com.SeleniumProject.javaprogrammes;

public class ReuseEg {

	public static void main(String[] args)
	{
		MethodsEg m=new MethodsEg();

//		m.Function3();
		int res=m.sum(100, 300, 400);
		System.out.println(res);
		
		HashSetEg h=new HashSetEg();
		res=h.sum(2000, 3000);
		System.out.println(res);

	}

	
}
