package com.test;
import java.util.*;
public class array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[6][6];
		System.out.println("Enter elements: ");
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int ar[][]=new int[4][4];
		int t,m,b;
        int s;
		for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                t=a[i][j]+a[i][j+1]+a[i][j+2];
                m=a[i+1][j+1];
                b=a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
                s=t+m+b;
                ar[i][j]=s;
                System.out.print(s+" ");
            }
            System.out.print("\n");
        }
		int g=-10000;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(ar[i][j]>g)
                {
                    g=ar[i][j];
                }
            }
        }
		System.out.print("largest  is "+g);
		sc.close();
	}

}
