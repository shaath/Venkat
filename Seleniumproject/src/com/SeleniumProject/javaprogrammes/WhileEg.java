package com.SeleniumProject.javaprogrammes;

public class WhileEg {

	public static void main(String[] args) 
	{
		int i=1;
		
		while(i<=10)
		{
			System.out.println(i);
			if (i==6) {
				break;
			}
			i++;	
		}

		
		int j=10;
		while(j>=1)
		{
			System.out.println(j);
			j--;
		}
	}

}
