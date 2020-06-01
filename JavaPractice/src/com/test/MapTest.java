package com.test;
import java.util.*;
public class MapTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String, String> dic = new HashMap<String, String>();
	    		/*System.out.println("Enter word:");
				String k=sc.nextLine();
				System.out.println("Enter Meaning:");
				String m=sc.nextLine();
				dic.put(k,m);*/
	    		for(Map.Entry<String, String> e:dic.entrySet()){
					System.out.print("Key = "+e.getKey()+"Value= "+e.getValue());}
	    	System.out.println("Exited..");
	    	  sc.close(); }  }