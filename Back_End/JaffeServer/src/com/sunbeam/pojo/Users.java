package com.sunbeam.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Users")
@NamedNativeQueries({
	@NamedNativeQuery(name="qry_StoProcRegisterUser",
		query="{CALL registerUser(:name, :mailId, :password, :aadharNo, :contactNo, :address, :output)}",
		hints={@QueryHint(name="org.hibernate.callable", value="true")}
		)
})
public class Users {
	@Column(name="Name")
	private String name;
	
	@Column(name="AadharCardNumber")
	private String aadharNumber;
	
	@Id
	@Column(name="Id")
	private String id;
	
	@Column(name="ContactNo")
	private String contactNo;
	
	@Column(name="Address")
	private String address;
	
	public Users() {
		this("", "", "", "", "");
	}

	public Users(String name, String aadharNumber, String id, String contactNo, String address) {
		this.name = name;
		this.aadharNumber = aadharNumber;
		this.id = id;
		this.contactNo = contactNo;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "RegisterUsers [name=" + name + ", aadharNumber=" + aadharNumber + ", id=" + id + ", contactNo="
				+ contactNo + ", address=" + address + "]";
	}
	
}
