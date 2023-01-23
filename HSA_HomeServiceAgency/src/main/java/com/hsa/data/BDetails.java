package com.hsa.data;

public class BDetails {
	private int bid;
	private int uid;
	private int pid;
	private String bDate;
	private String bTime;
	private String sDate;
	private String sTime;
	private int ammount;
	private String status;
	public BDetails(int bid, int uid, int pid, String bDate, String bTime, String sDate, String sTime, int ammount,
			String status) {
		super();
		this.bid = bid;
		this.uid = uid;
		this.pid = pid;
		this.bDate = bDate;
		this.bTime = bTime;
		this.sDate = sDate;
		this.sTime = sTime;
		this.ammount = ammount;
		this.status = status;
	}
	
	public BDetails(int uid, int pid, String bDate, String bTime, String sDate, String sTime, int ammount,
			String status) {
		super();
		this.uid = uid;
		this.pid = pid;
		this.bDate = bDate;
		this.bTime = bTime;
		this.sDate = sDate;
		this.sTime = sTime;
		this.ammount = ammount;
		this.status = status;
	}

	public BDetails(String bDate, String bTime, String sDate, String sTime, int ammount) {
		super();
		this.bDate = bDate;
		this.bTime = bTime;
		this.sDate = sDate;
		this.sTime = sTime;
		this.ammount = ammount;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getbDate() {
		return bDate;
	}
	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	public String getbTime() {
		return bTime;
	}
	public void setbTime(String bTime) {
		this.bTime = bTime;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public int getAmmount() {
		return ammount;
	}
	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "BDetails [bid=" + bid + ", uid=" + uid + ", pid=" + pid + ", bDate=" + bDate + ", bTime=" + bTime
				+ ", sDate=" + sDate + ", sTime=" + sTime + ", ammount=" + ammount + ", status=" + status + "]";
	}
}