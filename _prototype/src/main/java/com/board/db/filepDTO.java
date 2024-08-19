package com.board.db;

public class filepDTO {
	private int rownum;
	private int num;
	private String fname;
	private String ftime;
	private int fsize;
	
	public filepDTO(int rownum, int num, String fname, String ftime, int fsize) {
		super();
		this.rownum = rownum;
		this.num = num;
		this.fname = fname;
		this.ftime = ftime;
		this.fsize = fsize;
	}

	public filepDTO() {
		super();
	}

	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getFtime() {
		return ftime;
	}

	public void setFtime(String ftime) {
		this.ftime = ftime;
	}

	public int getFsize() {
		return fsize;
	}

	public void setFsize(int fsize) {
		this.fsize = fsize;
	}

	@Override
	public String toString() {
		return "filepDTO [rownum=" + rownum + ", num=" + num + ", fname=" + fname + ", ftime=" + ftime + ", fsize="
				+ fsize + "]";
	}
	
	
}