package com.sunbeam.pojo;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Login")
@NamedNativeQueries({
	@NamedNativeQuery(name="qry_StoProcLogin",
		query="{CALL authenticateUsers(:mailId, :password)}",
		hints={@QueryHint(name="org.hibernate.callable", value="true")},
		resultClass=Login.class
		)
})
public class Login implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="Status")
	private String status;
	
	
	@Column(name="MailId")
	private String mailId;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Role")
	private String role;
	
	@Id
	@Column(name="Id")
	private String id;
	
	@Column(name="RegisteredDate")
	private Date registrationDate;
	
	public Login() { 
		this( "", "", "", "", "", null);
	}

	

	public Login(String status, String mailId, String password, String role, String id, Date registrationDate) {
		super();
		this.status = status;
		this.mailId = mailId;
		this.password = password;
		this.role = role;
		this.registrationDate = registrationDate;
		this.id = id;
	}



	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	@Override
	public String toString() {
		return "Login [status=" + status + ", mailId=" + mailId + ", password=" + password + ", role=" + role + ", id="
				+ id + ", registrationDate=" + registrationDate + "]";
	}	
			
}
