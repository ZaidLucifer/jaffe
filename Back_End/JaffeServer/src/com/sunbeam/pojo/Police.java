package com.sunbeam.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.QueryHint;
import javax.persistence.Table;

@Entity
@Table(name="PoliceDepartment")
@NamedNativeQueries({
	@NamedNativeQuery(name="qry_StoProcRegisterPolice",
		query="{CALL registerPolice(:name, :mailId, :password, :contactNo, :pincode)}",
		hints={@QueryHint(name="org.hibernate.callable", value="true")}
		)
})
public class Police {
	
	@Column(name="PoliceDepartmentName")
	private String name;
	
	@Column(name="ContactNo")
	private String contactNo;
	
	@Column(name="AddressId")
	private String address;
	
	@Id
	@Column(name="Id")
	private String id;
	
	public Police() {
		this("", "", "", "");
	}

	public Police(String name, String contactNo, String address, String id) {
		this.name = name;
		this.contactNo = contactNo;
		this.address = address;
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Police [name=" + name + ", contactNo=" + contactNo + ", address=" + address + ", id=" + id
				+ "]";
	}
	
}
