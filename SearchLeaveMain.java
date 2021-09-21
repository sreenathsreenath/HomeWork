package com.java.infinite.LmsLeave;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchLeaveMain { 
	
	public static void main(String[] args) {
		int EMP_ID;
		System.out.println("enter EMP ID");
		Scanner sc= new Scanner(System.in);
		EMP_ID = sc.nextInt();
	     LeaveDao dao= new LeaveDao();
	     try {
			Leave leave =dao.searchLeave(EMP_ID);
			if(leave!=null) {
				System.out.println(leave);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
			
		}

}
