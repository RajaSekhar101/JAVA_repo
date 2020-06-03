package com.test;
import java.util.*;
class RectangleImp
{
	void perimeter(float l,float w)
	{
		float p;
		p=l+w;
		System.out.print("Perimter of rectangle is "+p);
	}
	void area(float l,float w)
	{
		float a;
		a=l*w;
		System.out.print("Area of rectangle is "+a);
	}
}
public class Rectangle {

	public static void main(String[] args) {
		RectangleImp o=new RectangleImp();
		Scanner s=new Scanner(System.in);
		float l=s.nextFloat();
		float w=s.nextFloat();
		o.perimeter(l, w);
		o.area(l, w);
		s.close();

	}

}
