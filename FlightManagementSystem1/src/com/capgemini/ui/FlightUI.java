
package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.dao.FlightDAO;
import com.capgemini.service.FlightService;



public class FlightUI 
{
	public static void main(String[] args) 
	{
		char a;
		System.out.println("Enter 'a' if you are an admin");
		System.out.println("Enter 'u' if you are a user");
		Scanner sc=new Scanner(System.in);
		a=sc.next().charAt(0);
		switch(a)
		{
		case 'a':{
			FlightService.addBook();
			break;
		}
		case 'u':
		{
			FlightDAO.methoduser();
			break;
		}
		default:{
			System.out.println("invalid user");
		}
		
		}
		
	}

}