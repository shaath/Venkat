package com.SeleniumProject.javaprogrammes;

public class ForEg {

	public static void main(String[] args)
	{
		// intialize; Condtion ; Incrementor
		System.out.println("This is Incrementor loop");
		for(int i=1; i <= 10; i++)
		{
//			System.out.println("Hi");
//			System.out.println("Welcome");
			System.out.println(i);
			if (i == 5)
			{
				break;
			}
		}
		
		System.out.println("This is Decrementor loop");
		for(int j=10; j >= 1; j--)  //j=j-1
		{
			System.out.println(j);
		}

	}

}
