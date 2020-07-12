package com.sunbeam.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;

@Entity
@Table(name="ComplaintsDetail")
@NamedNativeQueries({
	@NamedNativeQuery(name="qry_StoProcGetComplaints",
		query="{CALL getComplaint(:userId)}",
		hints={@QueryHint(name="org.hibernate.callable", value="true")},
		resultClass=Complaints.class
	),
	@NamedNativeQuery(name="qry_StoProcPostComplaints",
		query="{CALL registerComplaint(:id, :address, :pincode, :complaintText)}",
		hints={@QueryHint(name="org.hibernate.callable", value="true")}
	),
	@NamedNativeQuery(name="qry_StoProcUpdateStatus",
		query="{CALL updateStatus(:id)}"
	),
	@NamedNativeQuery(name="qry_StoProcUpdateDepartment",
		query="{CALL updateDepartment(:id)}"	
	)
})

public class Complaints {
	
	@Id
	@Column(name="Id")
	private int id;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Pincode")
	private String pincode;
	
	@Column(name="ComplaintText")
	private String complaintText;
	
	@Column(name="UserName")
	private String userName;
	
	@Column(name="NGOName")
	private String ngoName;
	
	@Column(name="PoliceName")
	private String policeName;
	
	@Column(name="ComplaintRegistrationDate")
	private Date registeredDate;
	
	@Column(name="ComplaintStatus")
	private String status;
	
	@Column(name="PeopleHelped")
	private String peopleHelped;
	
	public Complaints() {
		this( 0, "", "", "", "", "", "", null, "", "");
	}

	public Complaints(int id, String address, String pincode, String complaintText, String userName, String ngoName,
			String policeName, Date registeredDate, String status, String peopleHelped) {
		this.id = id;
		this.address = address;
		this.pincode = pincode;
		this.complaintText = complaintText;
		this.userName = userName;
		this.ngoName = ngoName;
		this.policeName = policeName;
		this.registeredDate = registeredDate;
		this.status = status;
		this.peopleHelped = peopleHelped;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getComplaintText() {
		return complaintText;
	}

	public void setComplaintText(String complaintText) {
		this.complaintText = complaintText;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPeopleHelped() {
		return peopleHelped;
	}

	public void setPeopleHelped(String peopleHelped) {
		this.peopleHelped = peopleHelped;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}

	public String getPoliceName() {
		return policeName;
	}

	public void setPoliceName(String policeName) {
		this.policeName = policeName;
	}

	@Override
	public String toString() {
		return "Complaints [id=" + id + ", address=" + address + ", pincode=" + pincode + ", complaintText="
				+ complaintText + ", userName=" + userName + ", ngoName=" + ngoName + ", policeName=" + policeName
				+ ", registeredDate=" + registeredDate + ", status=" + status + ", peopleHelped=" + peopleHelped + "]";
	}

}
