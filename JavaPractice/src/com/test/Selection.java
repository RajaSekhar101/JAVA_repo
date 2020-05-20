package com.test;
import java.util.*;
public class Selection {
	public static void main(String[] args) {
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
		int min_index=0;
		for(int i=0;i<n-1;i++)
		{
			min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[min_index])
				{
					min_index=j;
				}
			}
			int t;
			t=a[min_index];
			a[min_index]=a[i];
			a[i]=t;
		}
		System.out.println("Array after selection sort is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");	
		}
		sc.close();
	}

}
