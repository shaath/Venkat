package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEg {

	public static void main(String[] args) 
	{
		HashSet<Object> s=new HashSet<Object>();
		
		s.add("Selenium");
		s.add("Apple");
		s.add("boll");
		s.add(60000);
		s.add("Apple");
		
		Iterator<Object> it=s.iterator();
		
		while (it.hasNext()) 
		{
			Object data=it.next();
			System.out.println(data);
		}

	}

	public int sum(int a, int b)
	{
		int c=a+b;
		return c;
		
	}
}
