package com.test;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Length");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				System.out.print("****");
			}
			else
			{
				for(int j=0;j<n/2;j++)
				{
					System.out.print(" ");
				}
				System.out.print("****");
			}
			System.out.print("\n");
		}
		sc.close();

	}

}
