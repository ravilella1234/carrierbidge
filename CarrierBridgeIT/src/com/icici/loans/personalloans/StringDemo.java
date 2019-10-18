package com.icici.loans.personalloans;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		
		StringBuffer s1=new StringBuffer("ravikanth");
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		StringBuffer s2=new StringBuffer("lella");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		s1=s1.append(s2);
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		/*String s1="  Ravi Kanth";
		String s2=new String("Lella");
		
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.endsWith("nth"));
		System.out.println(s1.startsWith("ravi"));
		System.out.println(s1.concat(s2));
		System.out.println(s1.equals(s2));
		//System.out.println(s1.toUpperCase());
		String s=s1.trim();
		System.out.println(s);
		
		System.out.println(s.subSequence(1, 8));
		
		
		String[] str = s.split(" ");
		
		//System.out.println(str[0]);
		//System.out.println(str[1]);
		System.out.println(str[0]);
		System.out.println(str[1]);
		
		
		
		
		String s2=new String("lella");
		System.out.println(s2);
		System.out.println(s2.hashCode());
		
		s1=s1+s2;
		System.out.println(s1);
		System.out.println(s1.hashCode());*/
	}

}
