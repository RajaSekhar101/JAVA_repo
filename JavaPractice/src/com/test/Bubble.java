package com.test;
import java.util.*;
public class Bubble {

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
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("Array after Bubble sort is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+"\t");	
		}
		sc.close();
	}

}
