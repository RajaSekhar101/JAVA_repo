package com.test;
import java.util.*;
class Employee
{
	Scanner sc=new Scanner(System.in);
	String name=sc.next();
	String gender=sc.next();
	int age=sc.nextInt();
	String address=sc.next();
	void display()
	{
		System.out.println("The details of employee are ");
		System.out.println("Name="+name+"\nage="+age+"\nGender="+gender+"\naddress is"+address);
	}
}
class FullTimeEmployee extends Employee
{
	int salary=sc.nextInt();
	String designation=sc.next();
	void display()
	{
		super.display();
		System.out.println("salary is "+salary+" and designation is "+designation);
	}
	
}
class PartTimeEmployee extends FullTimeEmployee
{
	int amount;
	int workingHours=sc.nextInt();
	int ratePerHour=sc.nextInt();
	void calculatepay()
	{
		amount=workingHours*ratePerHour;
	}
	void display()
	{
		super.display();
		System.out.println("Amount to be paid is "+amount);
	}
	
}
public class EmployeeMain {

	public static void main(String[] args) {
		PartTimeEmployee o=new PartTimeEmployee();
		o.calculatepay();
		o.display();
	}

}
