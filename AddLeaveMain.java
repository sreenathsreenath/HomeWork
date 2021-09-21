package com.java.infinite.LmsLeave;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AddLeaveMain {

	
	public static void main(String[] args) throws ParseException {
		LeaveDao dao= new  LeaveDao(); 
		Leave leave= new Leave(); 
		Scanner sc= new Scanner(System.in);
		//System.out.println("Enter Leave id");
		//leave.setLEAVE_ID(sc.nextInt()); 
		System.out.println("enter no of leave days");
		leave.setLEAVE_NO_OF_DAYS(sc.next());
		System.out.println("Enter manager comments");
		leave.setMNGR_COMMENTS(sc.next());
		System.out.println("Enter Emp id");
		leave.setEMP_ID(sc.nextInt());
		System.out.println("enter leave start date");
		
		
		leave.setLEAVE_START_DATE(sc.next());
		System.out.println("Enter leave end date");
		leave.setLEAVE_END_DATE(sc.next());
		System.out.println("enter leave reason");
		leave.setLEAVE_REASON(sc.next()); 
		/*
		 * System.out.println("Enter leave type"); leave.setLEAVE_TYPE(sc.next());
		 * System.out.println("enter leave Status"); leave.setLEAVE_STATUS(sc.next());
		 */
		
		try {
			System.out.println(dao.addLeave(leave));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}





