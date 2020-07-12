package com.sunbeam.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;

@Entity
@Table(name="Details")

public class Details {
	@Id
	@Column(name="ComplaintId")
	private int id;
	
	@Column(name="UsersId")
	private String userId;
	
	
	@Column(name="NGOId")
	private String ngoId;
	
	@Column(name="PoliceId")
	private String policeId;
	
	public Details() {
		this(0, "", "", "");
	}

	public Details(int id, String userId, String ngoId, String policeId) {
		this.id = id;
		this.userId = userId;
		this.ngoId = ngoId;
		this.policeId = policeId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getNgoId() {
		return ngoId;
	}

	public void setNgoId(String ngoId) {
		this.ngoId = ngoId;
	}

	public String getPoliceId() {
		return policeId;
	}

	public void setPoliceId(String policeId) {
		this.policeId = policeId;
	}

	@Override
	public String toString() {
		return "Details [id=" + id + ", userId=" + userId + ", ngoId=" + ngoId + ", policeId=" + policeId + "]";
	}
	

}
