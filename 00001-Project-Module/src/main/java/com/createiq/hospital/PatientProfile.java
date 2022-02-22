package com.createiq.hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PatientProfile {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String patient_id;
	@Column
	private String password;
	@Column
	private String last_name;
	@Column
	private String first_name;
	@Column
	private String address;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private String zip;
	@Column
	private String occupation;
	@Column
	private String home_phone;
	@Column
	private String work_phone;
	@Column
	private String marital_status;
	@Column
	private String spousename;
	public PatientProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientProfile(String patient_id, String password, String last_name, String first_name, String address,
			String city, String state, String zip, String occupation, String home_phone, String work_phone,
			String marital_status, String spousename) {
		super();
		this.patient_id = patient_id;
		this.password = password;
		this.last_name = last_name;
		this.first_name = first_name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.occupation = occupation;
		this.home_phone = home_phone;
		this.work_phone = work_phone;
		this.marital_status = marital_status;
		this.spousename = spousename;
	}
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
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
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getHome_phone() {
		return home_phone;
	}
	public void setHome_phone(String home_phone) {
		this.home_phone = home_phone;
	}
	public String getWork_phone() {
		return work_phone;
	}
	public void setWork_phone(String work_phone) {
		this.work_phone = work_phone;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getSpousename() {
		return spousename;
	}
	public void setSpousename(String spousename) {
		this.spousename = spousename;
	}
	@Override
	public String toString() {
		return "PatientProfile [patient_id=" + patient_id + ", password=" + password + ", last_name=" + last_name
				+ ", first_name=" + first_name + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", occupation=" + occupation + ", home_phone=" + home_phone + ", work_phone="
				+ work_phone + ", marital_status=" + marital_status + ", spousename=" + spousename + "]";
	}
	
	

}
