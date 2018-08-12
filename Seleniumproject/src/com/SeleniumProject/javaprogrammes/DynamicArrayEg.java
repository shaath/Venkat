package com.SeleniumProject.javaprogrammes;

public class DynamicArrayEg {

	public static void main(String[] args) 
	{
		Object[] x=new Object[5];
		
		//Finding the length of the array
		System.out.println(x.length);
		
		//writing the ddata into an array
		
		x[2]="Selenium";
		x[4]=60000;
		
		x[2]="Sharath";
		
		//Reading the data from an array
		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i]);
		}
	}

}
