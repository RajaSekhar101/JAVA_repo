package com.test;
import java.util.*;
public class For {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);  
		l.add(2);  
		l.add(3);  
		l.add(4);
		Iterator<Integer> i=l.iterator();
		for (; i.hasNext();) {
	         System.out.println(i.next());
		}
	}
}
