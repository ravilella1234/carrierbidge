package com.icici.loans.collections;

import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<Integer, Integer> h=new TreeMap<>();
		h.put(40, 100);
		h.put(200, 200);
		h.put(150, 300);
		h.put(10, 100);
		h.put(1, 400);
		
		System.out.println(h);
		
		//System.out.println(h.get(30));
	
		

	}

}
