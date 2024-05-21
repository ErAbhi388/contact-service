package com.contact.contact_service.entity;

public class Contact {
	
	private Long cId;
	private String name;
	private String email;
	private Long phoneNo;
	private Long userId;
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Contact(Long cId, String name, String email, Long phoneNo, Long userId) {
		super();
		this.cId = cId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.userId = userId;
	}

}
