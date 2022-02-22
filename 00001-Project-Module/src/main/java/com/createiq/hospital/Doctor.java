package com.createiq.hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Table;


@Entity
@Table
public class Doctor {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int doctor_id;
	@Column
	private String password;
	@Column
	private String last_name;
	@Column
	private String first_name;
	@Column
	private String description;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int doctor_id, String password, String last_name, String first_name, String description) {
		super();
		this.doctor_id = doctor_id;
		this.password = password;
		this.last_name = last_name;
		this.first_name = first_name;
		this.description = description;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Doctor [doctor_id=" + doctor_id + ", password=" + password + ", last_name=" + last_name
				+ ", first_name=" + first_name + ", description=" + description + "]";
	}
	
	

}
