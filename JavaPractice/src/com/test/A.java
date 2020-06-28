package com.test;
import java.util.*;
class A
{
	public static void main(String args[])
	{
		LinkedList<String> l=new LinkedList<String>();
		l.add("hi");
		l.add("hi");
		l.add("there");
		l.add("How are you");
		System.out.println("List"+l.toString());
		for(int i=0;i<5;i++) {
			l.add("Number"+String.valueOf(i));
		}
		Collections.reverse(l);
		 for(String res:l) {
			 System.out.println(res);
		 }
		 for(int i=0;i<l.size();i++)
		 {
			 System.out.println(l.get(i));
		 }
		 System.out.println("Using for each ");
		 l.stream().forEach((t)->{System.out.println(t);});
		 l.forEach((t)->{System.out.println(t);});
	}
}