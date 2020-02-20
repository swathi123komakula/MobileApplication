
package com.capgemini.service;


import java.util.Scanner;


class tests{
	int testid=0;
	void deletetest(){
		System.out.println("2 delete the test");
	 Scanner tid=new Scanner(System.in);
	 System.out.println("enter the test id");
	testid=tid.nextInt();
	System.out.println("test deleted");
	}
	public void addtest(){
		System.out.println("1 add the test");
		 Scanner tid=new Scanner(System.in);
		 System.out.println("enter the test id");
		testid=tid.nextInt();
		System.out.println("test added");
		
	}
	void updatetest(){
		System.out.println("update the test");
}
	void assigntest(){
		System.out.println("assign the test");
	}
	class questions{
		
	}
	}
public class FlightService 
{

	public static int addBook() {
		// TODO Auto-generated method stub
		tests a=new tests();
		String username = "Admin";
		String password = "saikrishna";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the admin username");
		String userName1=sc.nextLine();
		System.out.println("Enter the admin password");
		String passWord1=sc.nextLine();
		
		if(userName1.equals(username)&& passWord1.equals(password))
		{
			System.out.println("welcome to admin page");
			System.out.println("1.add test\n 2.delete test\n");
			System.out.println("enter your option");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:{
				a.addtest();
				break;
			}
			case 2:
			{
				a.deletetest();
				break;
			}
			}
			
		}
		
		 else if (username.equals(username)) {
		        System.out.println("Invalid Password!");
		    } 
		else {
			System.out.println("invalid username and password");
		}
		
		
		
		return 0;
	}
}