package com.icici.loans.personalloans;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		
		
		int nr,dr,result;
		
		Scanner sc=new Scanner(System.in);
		
		
		while (true) 
		{
			
			System.out.println("enter the Numarator value : " );
			nr=sc.nextInt();
			System.out.println("enter the Denominator value : " );
			dr=sc.nextInt();
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			
			catch (Exception e)
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("Denominator value should be greater than zero...");
			} 
			finally {
				System.out.println("iam finnal block...");
			}
			
			
		}

	}

}
