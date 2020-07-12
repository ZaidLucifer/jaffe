package com.sunbeam.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class car
{
	@Id
	@Column
	private String name;
	@Column
	private String model;
	@Column
	private int price;
	
	public car(String name, String model, int price) {
		
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	public car() {
		
		this.name = "";
		this.model = "";
		this.price = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
		
}
