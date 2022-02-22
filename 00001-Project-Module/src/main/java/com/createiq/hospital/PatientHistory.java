package com.createiq.hospital;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class PatientHistory {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patient_id;
	@Column
	private int doctor_id;
	@Column
	private String visit_date;
	@Column
	private String diagnosis;
	public PatientHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientHistory(int patient_id, int doctor_id, String visit_date, String diagnosis) {
		super();
		this.patient_id = patient_id;
		this.doctor_id = doctor_id;
		this.visit_date = visit_date;
		this.diagnosis = diagnosis;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getVisit_date() {
		return visit_date;
	}
	public void setVisit_date(String visit_date) {
		this.visit_date = visit_date;
	}
	public String getDiagnosis() {
		return diagnosis;
	}
	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	@Override
	public String toString() {
		return "PatientHistory [patient_id=" + patient_id + ", doctor_id=" + doctor_id + ", visit_date=" + visit_date
				+ ", diagnosis=" + diagnosis + "]";
	}
	
	

}
