package com.sunbeam.pojo;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int application_id;
	private int status;
	private String name;
	private String email;
	private String password;
	private Date dateOfBirth;
	private LocalDate registration_date;

	public LocalDate getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(LocalDate registration_date) {
		this.registration_date = registration_date;
	}

	private String visa_service;

	public Login(int status, String name, String email, String password, java.sql.Date dateOfBirth, String visa_service) {
		this.status = status;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.visa_service = visa_service;
	}

	public Login() {
		this.status = 0;
		this.name = "";
		this.email = "";
		this.password = "";
		this.visa_service = "";
	}

	@Id
	@Column
	public int getApplication_id() {
		return application_id;
	}

	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}

	@Column
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	@Column
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="date_birth")
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(java.sql.Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column
	public String getVisa_service() {
		return visa_service;
	}

	public void setVisa_service(String visa_service) {
		this.visa_service = visa_service;
	}
	
}
