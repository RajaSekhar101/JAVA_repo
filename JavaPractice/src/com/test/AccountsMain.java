package com.test;
import java.util.*;
abstract class Account
{
	void withdrawl()
	{
	}
	void deposit()
	{
	}
	void display()
	{
	}
}
class SavingsAccount extends Account
{
	int rateOfInterest;
	void calculateAmount(String accountHolderName,int balance,int accountNumber,String address)
	{
		System.out.println("The account Holder  "+accountHolderName+" of account Number "+accountNumber+" has balance of "+balance);
	}
	
}
public class AccountsMain {

	public static void main(String[] args) {
		int balance,accountNumber;
		String accountHolderName,address;
		Scanner sc=new Scanner(System.in);
		balance=sc.nextInt();
		accountNumber=sc.nextInt();
		accountHolderName=sc.next();
		address=sc.next();
		SavingsAccount o=new SavingsAccount();
		o.calculateAmount(accountHolderName,balance,accountNumber,address);
		sc.close();

	}

}
