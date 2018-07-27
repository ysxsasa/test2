package com.sanyang.vo;

public class Userss {

	
	private Integer usid ;// number,
	private String  uname ;// varchar2(50),
	private String  imname ;// varchar2(50),
	private String  imbm  ;// varchar2(50),
	private String  impath ;// varchar2(200)
	private String pawd;
	
	
	public String getPawd() {
		return pawd;
	}
	public void setPawd(String pawd) {
		this.pawd = pawd;
	}
	public Integer getUsid() {
		return usid;
	}
	public void setUsid(Integer usid) {
		this.usid = usid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getImname() {
		return imname;
	}
	public void setImname(String imname) {
		this.imname = imname;
	}
	public String getImbm() {
		return imbm;
	}
	public void setImbm(String imbm) {
		this.imbm = imbm;
	}
	public String getImpath() {
		return impath;
	}
	public void setImpath(String impath) {
		this.impath = impath;
	}
	
	
	
	
}
