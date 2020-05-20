package com.test;
import java.util.*;
public class Solution {
    static void miniMaxSum(int[] arr) {
        int min=2099999999,max=0,sum;
        for(int i=0;i<5;i++)
        {
            sum=0;
            for(int j=0;j<5;j++)
            {
                if(i!=j)
                {
                    sum=sum+arr[j];
                }
            }
            System.out.println("Sum of elements is "+sum);
            if(sum<min)
            {
                min=sum;
            }
            if(max<sum)
            {
                max=sum; 
            }
        }
        System.out.println(min+" "+max);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
