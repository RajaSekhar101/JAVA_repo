package com.test;

import java.util.*;
class Insertion
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array: ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();		
		}
		int key,j=0;
		for(int k=0;k<=n;k++) 
		{
		for(int i=1;i<n;i++)
		{
			key=a[i];
			j=i-1;
			while(j>0 && a[j]>key)
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=key;
		}
		}
		System.out.println("After sorting: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");	
		}

		sc.close();
	}
}