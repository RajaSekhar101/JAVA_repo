package com.test;
import java.util.*;
public class Asci {

	public static void main(String[] args) {
	for(int i=0;i<256;i++)
	{
		char c=(char)i;
		int a=(int)c;
		if(a>=48 && a<58)
		{
			System.out.println("ASCi of "+c+" is "+a);
		}
		
	}
	}

}
