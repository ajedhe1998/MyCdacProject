package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity
public class AdminModel {
	@Id
	int admin_id;
	@Column(nullable = false)
	String email;
	@Column(nullable = false)
	String password;

	public AdminModel(int admin_id, String email, String password) {
		super();
		this.admin_id = admin_id;
		this.email = email;
		this.password = password;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", email=" + email + ", password=" + password + "]";
	}

	public AdminModel() {
		super();
	}
	
}
