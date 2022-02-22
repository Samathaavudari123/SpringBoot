package com.createiq.hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Suplier {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int supplier_id;
	@Column
	private String password;
	@Column
	private String name;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zip;
	public Suplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Suplier(int supplier_id, String password, String name, String address, String city, String state,
			String zip) {
		super();
		this.supplier_id = supplier_id;
		this.password = password;
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Suplier [supplier_id=" + supplier_id + ", password=" + password + ", name=" + name + ", address="
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

	
}
