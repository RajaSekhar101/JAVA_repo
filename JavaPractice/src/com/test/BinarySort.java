package com.test;
import java.util.*;
class Binarys
{
	int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
            if (arr[mid] == x) 
                return mid;  
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
            return binarySearch(arr, mid + 1, r, x); 
        } 
        return -1; 
    } 
}
class BinarySort
{
	public static void main(String args[])
	{
		int n,k;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		k=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();		
		}
		Binarys o=new Binarys();
		int result;
		result=o.binarySearch(a,0,n,k);
		if(result==-1) {
			System.out.println("Element not found");
		}
		else {
		System.out.println("elemet found at index "+result);
		}
		sc.close();
	}
}