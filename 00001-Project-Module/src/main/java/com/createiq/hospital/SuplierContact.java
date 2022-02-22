package com.createiq.hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class SuplierContact {
	
	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int supplier_id;
	@Column
	private String number;
	@Column
	private String dial_code;
	public SuplierContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SuplierContact(int supplier_id, String number, String dial_code) {
		super();
		this.supplier_id = supplier_id;
		this.number = number;
		this.dial_code = dial_code;
	}
	public int getSupplier_id() {
		return supplier_id;
	}
	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDial_code() {
		return dial_code;
	}
	public void setDial_code(String dial_code) {
		this.dial_code = dial_code;
	}
	@Override
	public String toString() {
		return "SuplierContact [supplier_id=" + supplier_id + ", number=" + number + ", dial_code=" + dial_code + "]";
	}

	
}
