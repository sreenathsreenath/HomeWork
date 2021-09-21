package com.java.infinite.LmsLeave;

public class Leave {
	
	private int LEAVE_ID;
	private String LEAVE_NO_OF_DAYS;
	private String MNGR_COMMENTS;
	private int EMP_ID;
	private String LEAVE_START_DATE;
	private String LEAVE_END_DATE;
	private LeaveStatus LEAVE_STATUS;
	private LeaveType LEAVE_TYPE;
	private String LEAVE_REASON;
	@Override
	public String toString() {
		return "Leave [LEAVE_ID=" + LEAVE_ID + ", LEAVE_NO_OF_DAYS=" + LEAVE_NO_OF_DAYS + ", MNGR_COMMENTS="
				+ MNGR_COMMENTS + ", EMP_ID=" + EMP_ID + ", LEAVE_START_DATE=" + LEAVE_START_DATE + ", LEAVE_END_DATE="
				+ LEAVE_END_DATE + ", LEAVE_STATUS=" + LEAVE_STATUS + ", LEAVE_TYPE=" + LEAVE_TYPE + ", LEAVE_REASON="
				+ LEAVE_REASON + "]";
	}
	public Leave(int lEAVE_ID, String lEAVE_NO_OF_DAYS, String mNGR_COMMENTS, int eMP_ID, String lEAVE_START_DATE,
			String lEAVE_END_DATE, LeaveStatus lEAVE_STATUS, LeaveType lEAVE_TYPE, String lEAVE_REASON) {
	
		LEAVE_ID = lEAVE_ID;
		LEAVE_NO_OF_DAYS = lEAVE_NO_OF_DAYS;
		MNGR_COMMENTS = mNGR_COMMENTS;
		EMP_ID = eMP_ID;
		LEAVE_START_DATE = lEAVE_START_DATE;
		LEAVE_END_DATE = lEAVE_END_DATE;
		LEAVE_STATUS = lEAVE_STATUS;
		LEAVE_TYPE = lEAVE_TYPE;
		LEAVE_REASON = lEAVE_REASON;
	}
	public Leave() {
		super();
	}
	public int getLEAVE_ID() {
		return LEAVE_ID;
	}
	public void setLEAVE_ID(int lEAVE_ID) {
		LEAVE_ID = lEAVE_ID;
	}
	public String getLEAVE_NO_OF_DAYS() {
		return LEAVE_NO_OF_DAYS;
	}
	public void setLEAVE_NO_OF_DAYS(String lEAVE_NO_OF_DAYS) {
		LEAVE_NO_OF_DAYS = lEAVE_NO_OF_DAYS;
	}
	public String getMNGR_COMMENTS() {
		return MNGR_COMMENTS;
	}
	public void setMNGR_COMMENTS(String mNGR_COMMENTS) {
		MNGR_COMMENTS = mNGR_COMMENTS;
	}
	public int getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(int eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getLEAVE_START_DATE() {
		return LEAVE_START_DATE;
	}
	public void setLEAVE_START_DATE(String lEAVE_START_DATE) {
		LEAVE_START_DATE = lEAVE_START_DATE;
	}
	public String getLEAVE_END_DATE() {
		return LEAVE_END_DATE;
	}
	public void setLEAVE_END_DATE(String lEAVE_END_DATE) {
		LEAVE_END_DATE = lEAVE_END_DATE;
	}
	public LeaveStatus getLEAVE_STATUS() {
		return LEAVE_STATUS;
	}
	public void setLEAVE_STATUS(LeaveStatus lEAVE_STATUS) {
		LEAVE_STATUS = lEAVE_STATUS;
	}
	public LeaveType getLEAVE_TYPE() {
		return LEAVE_TYPE;
	}
	public void setLEAVE_TYPE(LeaveType lEAVE_TYPE) {
		LEAVE_TYPE = lEAVE_TYPE;
	}
	public String getLEAVE_REASON() {
		return LEAVE_REASON;
	}
	public void setLEAVE_REASON(String lEAVE_REASON) {
		LEAVE_REASON = lEAVE_REASON;
	}
	

	
	
	
	
	
	
	
	
	
}
