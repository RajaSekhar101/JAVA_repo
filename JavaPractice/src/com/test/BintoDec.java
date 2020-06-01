package com.test;
import java.util.*;
public class BintoDec {
	    public static void main(String[] args) {
	        System.out.println("Enter Length");
	        Scanner sc=new Scanner(System.in);
	        long num=sc.nextInt();
	        int decimal = convertBinaryToDecimal(num);
	        System.out.printf("%d in binary = %d in decimal", num, decimal);
	        sc.close();
	    }
	    public static int convertBinaryToDecimal(long num)
	    {
	        int decimalNumber = 0, i = 0;

	        long remainder;
	        while (num != 0)
	        {
	            remainder = num % 10;
	            num /= 10;
	            decimalNumber += remainder * Math.pow(2, i);
	            ++i;
	        }
	        return decimalNumber;
	    }
	}
