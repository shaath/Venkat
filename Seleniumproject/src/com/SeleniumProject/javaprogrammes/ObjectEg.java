package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args) 
	{
		Object[] x={"Selenium",40000, 'M',444.4, true}; 

		System.out.println(x.length);
		
		for (Object i : x)
		{
			System.out.println(i);
		}
	}

}
