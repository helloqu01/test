package com.freeflux.model;

public class BoardModel {
private int num;
private String subject;
private String writer;
private String contents;
private int hit;
private String reg_date;
private String mod_date;
private String ip;
private int good;
public int getnum(){
	return num;
	}//public int getnum(){
public int getNum() {
	return num;
}

//alt+shift+s+r 겟터세터 만들기


public void setNum(int num) {
	this.num = num;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public String getContents() {
	return contents;
}
public void setContents(String contents) {
	this.contents = contents;
}
public int getHit() {
	return hit;
}
public void setHit(int hit) {
	this.hit = hit;
}
public String getReg_date() {
	return reg_date;
}
public void setReg_date(String reg_date) {
	this.reg_date = reg_date;
}
public String getMod_date() {
	return mod_date;
}
public void setMod_date(String mod_date) {
	this.mod_date = mod_date;
}
public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public int getGood() {
	return good;
}
public void setGood(int good) {
	this.good = good;
}


}//public class boardModel

