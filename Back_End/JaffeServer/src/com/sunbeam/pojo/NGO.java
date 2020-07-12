package com.sunbeam.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;

@Entity
@Table(name="NGOs")
@NamedNativeQueries({
	@NamedNativeQuery(name="qry_StoProcRegisterNGO",
		query="{CALL registerNGO(:name, :mailId, :password, :contactNo, :CertificateId, :pincode)}",
		hints={@QueryHint(name="org.hibernate.callable", value="true")}
		)
})
public class NGO {
	
	@Column(name="NGOName")
	private String name;
	
	@Column(name="ContactNo")
	private String contactNo;
	
	@Column(name="RegistrationCertificateId")
	private String certificateId;
	
	@Column(name="AddressId")
	private String address;
	
	@Id
	@Column(name="Id")
	private String id;
	
	public NGO() {
		this("", "", "", "", "");
	}

	public NGO(String name, String contactNo, String certificateId, String id, String address) {
		this.name = name;
		this.contactNo = contactNo;
		this.certificateId = certificateId;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "NGO [name=" + name + ", contactNo=" + contactNo + ", certificateId=" + certificateId + ", id="
				+ id + "]";
	}
	
	
}
