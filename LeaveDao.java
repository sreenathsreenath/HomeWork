package com.java.infinite.LmsLeave;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LeaveDao {

	
	  Connection connection;
	  PreparedStatement pst;
	  
	  public  Leave searchLeave(int empId) throws ClassNotFoundException, SQLException {
		  connection=ConnectionHelper.getConnection(); 
		  String cmd="select * from LEAVE_HISTORY where EMP_ID=?";
		  pst= connection.prepareStatement(cmd);
		  pst.setInt(1, empId);
		  ResultSet rs=pst.executeQuery();
		  Leave leave =null;
		  while(rs.next()) {
			  leave= new Leave();
			  leave.setEMP_ID(leave.getEMP_ID());
			  leave.setLEAVE_NO_OF_DAYS(leave.getLEAVE_NO_OF_DAYS());
			  leave.setLEAVE_START_DATE(leave.getLEAVE_START_DATE());
			  leave.setLEAVE_END_DATE(leave.getLEAVE_END_DATE());
			  leave.setMNGR_COMMENTS(leave.getMNGR_COMMENTS());
			  leave.setLEAVE_TYPE(leave.getLEAVE_TYPE());
			  leave.setLEAVE_STATUS(leave.getLEAVE_STATUS());
		  }
		return leave;
		  
		
		  
	  }
	public String addLeave(Leave leave) throws ClassNotFoundException, SQLException {
		connection=ConnectionHelper.getConnection();
		/*int LEAVE_ID=generateLeaveID();
		leave.setLEAVE_ID(LEAVE_ID);*/
		String cmd=null;
		 cmd="insert into LEAVE_HISTORY(LEAVE_ID,LEAVE_NO_OF_DAYS,LEAVE_MNGR_COMMENTS,EMP_ID,LEAVE_START_DATE,LEAVE_END_DATE,LEAVE_REASON) values(?,?,?,?,?,?,?)";
		pst=connection.prepareStatement(cmd);
		pst.setInt(1,leave.getLEAVE_ID());
		pst.setString(2, leave.getLEAVE_NO_OF_DAYS());
		pst.setString(3,leave.getMNGR_COMMENTS());
		pst.setInt(4, leave.getEMP_ID());
		System.out.println(leave.getLEAVE_START_DATE());
		pst.setDate(5,java.sql.Date.valueOf(leave.getLEAVE_START_DATE()));
		pst.setDate(6,java.sql.Date.valueOf(leave.getLEAVE_END_DATE()));
		pst.setString(7,leave.getLEAVE_REASON());
		pst.executeUpdate();
		return"*********Leave Added Sucessfully**************";
				
	}
	
	
	public int generateLeaveID() throws ClassNotFoundException, SQLException {
		connection= ConnectionHelper.getConnection();
		String cmd = "select case when max(LEAVE_ID) IS NULL THEN 1 ELSE max(LEAVE_ID)+1 END  LEAVE_ID from LEAVE_HISTORY";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int LEAVE_ID = rs.getInt("LEAVE_ID");
		return LEAVE_ID;
	
		
	}
	
	
	public Leave[] ShowLeave() throws ClassNotFoundException, SQLException {
        connection = ConnectionHelper.getConnection();
        String cmd =" select * from LEAVE_HISTORY";
        pst = connection.prepareStatement(cmd);
        ResultSet rs = pst.executeQuery();
        List<Leave> list = new ArrayList<Leave>();
        while(rs.next()) {
            Leave leave = new Leave();
            leave.setLEAVE_ID(rs.getInt("EMP_ID"));
            leave.setEMP_ID(1000);
            list.add(leave);
        }
        return list.toArray(new Leave[list.size()]);

 

    }

} 



