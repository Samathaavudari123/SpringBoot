package com.createiq.hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SalesPerson {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private	int slaes_person_id;
	@Column
	private	String password;
	@Column
	private	String last_name;
	@Column
	private String first_name;
	public SalesPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalesPerson(int slaes_person_id, String password, String last_name, String first_name) {
		super();
		this.slaes_person_id = slaes_person_id;
		this.password = password;
		this.last_name = last_name;
		this.first_name = first_name;
	}
	public int getSlaes_person_id() {
		return slaes_person_id;
	}
	public void setSlaes_person_id(int slaes_person_id) {
		this.slaes_person_id = slaes_person_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	@Override
	public String toString() {
		return "SalesPerson [slaes_person_id=" + slaes_person_id + ", password=" + password + ", last_name=" + last_name
				+ ", first_name=" + first_name + "]";
	}
	
	
}
