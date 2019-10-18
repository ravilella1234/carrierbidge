package com.icici.loans.collections;

import java.util.ArrayList;

public class ListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Object> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add("ravilella");
		a.add(12.34f);
		a.add(30);
		a.add(20);
		a.add(40);
		
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.size());
		System.out.println(a.hashCode());
		System.out.println(a.isEmpty());
		a.remove(2);
		System.out.println(a);
		//a.clear();
		//System.out.println(a);
		a.add(2, "lella");
		System.out.println(a);

	}

}
