package com.java.infinite.LmsLeave;

import java.sql.SQLException;

public class ShowLeaveMain {
public static void main(String[] args)  {
	
	LeaveDao dao= new LeaveDao();
	Leave[] leaveList; 
	try {
		leaveList= dao.ShowLeave();
		for (Leave l : leaveList) { 
			System.out.println(l);
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
