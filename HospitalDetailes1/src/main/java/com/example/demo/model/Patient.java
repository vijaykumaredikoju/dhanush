package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "hosptal")

@DynamicInsert
@DynamicUpdate

public class Patient {

	@Id
	@GeneratedValue
	private Long patient_Registration;
	private String patient_Name;
	private String patient_Address;
	public Patient() {
		super();
	}
	public Patient(Long patient_Registration, String patient_Name, String patient_Address) {
		super();
		this.patient_Registration = patient_Registration;
		this.patient_Name = patient_Name;
		this.patient_Address = patient_Address;
	}
	public Long getPatient_Registration() {
		return patient_Registration;
	}
	public void setPatient_Registration(Long patient_Registration) {
		this.patient_Registration = patient_Registration;
	}
	public String getPatient_Name() {
		return patient_Name;
	}
	public void setPatient_Name(String patient_Name) {
		this.patient_Name = patient_Name;
	}
	public String getPatient_Address() {
		return patient_Address;
	}
	public void setPatient_Address(String patient_Address) {
		this.patient_Address = patient_Address;
	}
	@Override
	public String toString() {
		return "Patient [patient_Registration=" + patient_Registration + ", patient_Name=" + patient_Name
				+ ", patient_Address=" + patient_Address + "]";
	}
	public void addAttribute(String string, Patient entity) {
		// TODO Auto-generated method stub
		
	}
	
	
}
