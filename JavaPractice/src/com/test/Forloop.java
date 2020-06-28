package com.test;
import java.util.*;
public class Forloop {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		for(Integer t:l)
		{
			System.out.println(t);
		}
		Iterator<Integer> i=l.iterator();
		while(i.hasNext()){
	         System.out.println(i.next());
	         System.out.println("I is "+i);
		}
	}
}