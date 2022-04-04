package com.lywhxy.pojo;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;	
	int id;
	String username;
	String gender;
	String email;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", gender=" + gender + ", email=" + email + "]\n";
	}
	
	
}
