package com.test;
import java.util.*;
class MotorVehicle
{
	void dispay(String modelname,int modelnumber,int modelPrice)
	{
		System.out.println("ModelName is "+modelname+" and modelNUmber is  "+modelnumber+" which has price of "+modelPrice);
	}
}
class Car extends MotorVehicle
{
	int discount;
	void display(String modelname,int modelnumber,int modelPrice)
	{
	System.out.println("ModelName is "+modelname+" and modelNUmber is  "+modelnumber+" which has price of "+modelPrice);
	}
	void discount(int modelPrice)
	{
		discount=(modelPrice*(10/100));
		System.out.println("Discount with 10% is "+discount);
	}
	
}
public class MotorVehicleMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String modelname;
		int modelnumber,modelPrice;
		modelname=s.next();
		modelnumber=s.nextInt();
		modelPrice=s.nextInt();
		Car o=new Car();
		o.display(modelname,modelnumber,modelPrice);
		o.discount(modelPrice);
		s.close();

	}

}
