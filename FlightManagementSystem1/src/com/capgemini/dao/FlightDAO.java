
package com.capgemini.dao;



import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

import java.util.Scanner;



public class FlightDAO 
{
	@SuppressWarnings("static-access")
	public static void methoduser()
	{
		Connection c=null;
		Statement s=null;
		int uid;
		String uname;
		String upassword;
		Scanner sc=new Scanner(System.in);
		
		
		FlightDB db=new FlightDB();
		/*ArrayList<Integer> usrid=new ArrayList<Integer>();	
		ArrayList<String> usrname=new ArrayList<String>();
		ArrayList<String> usrpassword=new ArrayList<String>();*/
		try
		{
		
		c=db.getConnection1();
		 Statement st=c.createStatement();
		 System.out.println("enter id");
		 uid=sc.nextInt();
		 ResultSet rs= st.executeQuery("select * from atest where userid="+uid);
		
		 
		 while(rs.next())
		 {
			 
			 System.out.println("enter the user name");
				uname=sc.next();
				System.out.println("Enter the user password");
				upassword=sc.next();
			 if(uname.equals(rs.getString(2))&&upassword.equals(rs.getString(3))){
					 System.out.println("valid");
			 System.out.println("you can take test");}
			 else
				 System.out.println("invalid");
		 }
		 /*while(!(rs.next()))
				 {
			 System.out.println("invalid id");
			 break;
				 }*/
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
				}
}