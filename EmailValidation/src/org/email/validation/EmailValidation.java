package org.email.validation;

import java.util.Scanner;
import java.util.regex.*;

public class EmailValidation {
	public static void emailCheck(String s,String[] s1)
	{
		int x1=0;
		for(int i=0;i<s1.length;i++)
		{
			if(s.equals(s1[i]))
			{
				
				System.out.println("Your email Id present in the database.");
				x1=1;
			}
		}
		while(x1==0)
		{
			System.out.println("Your email Id is not present in the database.");
			break;
		}
	}
	public static void emailCheck1(String email,String[] arr)
	{
		System.out.println(email);
		String x2="[a-zA-Z]{1,14}\\@[a-zA-Z]{1,10}\\.[a-z]{1,3}";
		Pattern p=Pattern.compile(x2);
		Matcher m=p.matcher(email);
		if(m.find())
		{
			System.out.println("Your Mail ID: "+email+" is Valid.");
			emailCheck(email,arr);
		}
		else
		{
			System.out.println("Enter the Valid Mail ID.");
		}
	}

	public static void main(String[] args) {
		final String[] empEmails= {"abc@gmail.com","abc123@gmail.com","xyz@gmail.com","uvw@gmail.com","wxyz@company.com","mno@company.com"};
		String x3;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Email ID:");
		x3=in.next();
		emailCheck1(x3,empEmails);
		in.close();

	}


}
