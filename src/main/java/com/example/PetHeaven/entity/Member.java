package com.example.PetHeaven.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member {
	
	@Id
	@Column(name = "account")
	private String account;
	
	@Column(name = "password")
	private String pwd;
	
	@Column(name = "member_gender")
	private String memberGender;
	
	@Column(name = "member_name")
	private String memberName;
	
	@Column(name = "member_phone")
	private String memberPhone;
	
	@Column(name = "member_email")
	private String memberEmail;
	
	@Column(name = "birthday")
	private LocalDate birthday;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "member_point")
	private String memberPoint;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String account, String pwd, String memberGender, String memberName, String memberPhone,
			String memberEmail, LocalDate birthday, String address, String memberPoint) {
		super();
		this.account = account;
		this.pwd = pwd;
		this.memberGender = memberGender;
		this.memberName = memberName;
		this.memberPhone = memberPhone;
		this.memberEmail = memberEmail;
		this.birthday = birthday;
		this.address = address;
		this.memberPoint = memberPoint;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberPhone() {
		return memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMemberPoint() {
		return memberPoint;
	}

	public void setMemberPoint(String memberPoint) {
		this.memberPoint = memberPoint;
	}
	
}
