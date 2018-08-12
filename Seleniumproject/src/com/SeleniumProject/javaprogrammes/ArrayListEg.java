package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the ddata into arraylist
		
		x.add("Selenium");
		x.add(60000);
		x.add("Apple");
		x.add("Boll");
		x.add(true);
		x.add(5, "UFT");
		
		x.add(2, "Ornament");
//	Finding the size of the arraylist
		
		
		System.out.println(x.size());
		
		//Reading the data from arraylist
//		System.out.println(x.get(2));
		for (int i = 0; i < x.size(); i++)
		{
			System.out.println(x.get(i));
		}
	}

}
