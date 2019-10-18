package com.icici.loans.collections;

import java.util.LinkedHashSet;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> h=new LinkedHashSet<>();
		h.add(10);
		h.add(20);
		h.add(10);
		h.add(30);
		
		System.out.println(h);

	}

}
