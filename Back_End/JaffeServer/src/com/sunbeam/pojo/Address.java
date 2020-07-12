package com.sunbeam.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Address {
	
	@Column(name="Country")
	private String country;
	
	@Column(name="State")
	private String state;
	
	@Column(name="City")
	private String city;
	
	@Column(name="Pincode")
	private String pincode;
	
	@Id
	@Column(name="AddressId")
	private String addressId;
	
	public Address() {
		this("", "", "", "", "");
	}

	public Address(String country, String state, String city, String pincode, String addressId) {
		this.country = country;
		this.state = state;
		this.city = city;
		this.pincode = pincode;
		this.addressId = addressId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", city=" + city + ", pincode=" + pincode
				+ ", addressId=" + addressId + "]";
	}
	
}
