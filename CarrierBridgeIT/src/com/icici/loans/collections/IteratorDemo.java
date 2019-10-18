package com.icici.loans.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> a=new ArrayList<>();
		a.add("capital");
		a.add("oaktech");
		a.add("durgasoft");
		a.add("MindQ");
		
		System.out.println(a);
		
		 ListIterator<String> var = a.listIterator();
		while(var.hasNext())
		{
			String val = var.next();
			if(val.contains("oaktech"))
				var.set("carrier");
			else
				var.remove();
				
		}
		System.out.println(a);
	}

}
