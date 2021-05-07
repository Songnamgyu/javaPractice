package com.song.practice.io.filterStream.vo;

public class MemberVO implements java.io.Serializable {

	private String id;
	private String pwd;
	private String name;
	private String mail;
	private int age;
	private String gender;
	private double point;
	
	
	public MemberVO() {
		
	}


	public MemberVO(String id, String pwd, String name, String mail, int age, String gender, double point) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.mail = mail;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}


	public String getId() {
		return id;
	}


	public String getPwd() {
		return pwd;
	}


	public String getName() {
		return name;
	}


	public String getMail() {
		return mail;
	}


	public int getAge() {
		return age;
	}


	public String getGender() {
		return gender;
	}


	public double getPoint() {
		return point;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setPwd(String pwd) {
		this.pwd = pwd;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setPoint(double point) {
		this.point = point;
	}


	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pwd=" + pwd + ", name=" + name + ", mail=" + mail + ", age=" + age
				+ ", gender=" + gender + ", point=" + point + "]";
	}
	
	
}
