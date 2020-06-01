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
		System.out.println("LIst"+l.toString());
		for(int i=0;i<5;i++) {
			l.add("Number"+String.valueOf(i));
		}
		Collections.reverse(l);
		System.out.print("Reversed list is "+l);
		LinkedList<String> l2=new LinkedList<String>();
		System.out.print("copied list is "+l2);
		 for(String res:l2) {
			 System.out.println("val="+res);
		 }
	}
}