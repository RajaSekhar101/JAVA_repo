package com.test;
import java.util.*;
class LinearSearch
{
	public static void main(String args[])
	{
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();		
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				System.out.println("Value "+k+" found at index "+i);
				break;
			}
			
		}
		sc.close();
	}
}