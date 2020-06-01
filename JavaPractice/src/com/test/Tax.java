package com.test;
import java.util.*;
public class Tax {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount:- ");
		int t=sc.nextInt();
		double p;
		p=(t*(12.35/100));
		System.out.println("Total amount along with tax is "+(t+p));
		sc.close();

	}

}
