package com.icici.loans.personalloans;

import java.util.Scanner;

public class UserExceptionDemo extends Exception
{

	public UserExceptionDemo(String msg) 
	{
		super(msg);
	}

	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		
		
		while (true) 
		{
			System.out.println("Enter the String :");
			str=sc.nextLine();
			if (str.length() != 10) 
			{
				try 
				{
					throw new UserExceptionDemo("String should be 10 character..");
				} 
				catch (UserExceptionDemo e) 
				{
					e.printStackTrace();
				}
			} 
			else
			{
				System.out.println(str);
				break;
			}
		}

	}

}
