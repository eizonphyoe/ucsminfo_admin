package com.azp.examresult.model;

import com.google.gson.annotations.SerializedName;

public class ExamResult{

	@SerializedName("status")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@SerializedName("s206")
	private String s206;

	@SerializedName("s205")
	private String s205;

	@SerializedName("s202")
	private String s202;

	@SerializedName("s201")
	private String s201;

	@SerializedName("s204")
	private String s204;

	@SerializedName("roll_no")
	private String rollNo;

	@SerializedName("s203")
	private String s203;

	@SerializedName("name")
	private String name;

	@SerializedName("english")
	private String english;

	public void setS206(String s206){
		this.s206 = s206;
	}

	public String getS206(){
		return s206;
	}

	public void setS205(String s205){
		this.s205 = s205;
	}

	public String getS205(){
		return s205;
	}

	public void setS202(String s202){
		this.s202 = s202;
	}

	public String getS202(){
		return s202;
	}

	public void setS201(String s201){
		this.s201 = s201;
	}

	public String getS201(){
		return s201;
	}

	public void setS204(String s204){
		this.s204 = s204;
	}

	public String getS204(){
		return s204;
	}

	public void setRollNo(String rollNo){
		this.rollNo = rollNo;
	}

	public String getRollNo(){
		return rollNo;
	}

	public void setS203(String s203){
		this.s203 = s203;
	}

	public String getS203(){
		return s203;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEnglish(String english){
		this.english = english;
	}

	public String getEnglish(){
		return english;
	}
}