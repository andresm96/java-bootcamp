package com.Exercise3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Doctor {

	private String name;
	private Speciality speciality;
	private List<Patient> patients = new ArrayList<Patient>();

	
	public Doctor(String name, Speciality speciality) {
		this.name = name;
		this.speciality = speciality;
	}

	public enum Speciality {
		OPTHALMOLOGIST, SURGEON, ENT
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Speciality getSpeciality() {
		return speciality;

	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}

	public List<Patient> getPatients() {
		return patients;

	}

	public void addPatients(Patient patient) {
		patients.add(patient);
	}

	public void print() {
		System.out.println("Doctor name: " + name + " Speciality :" + speciality);
		System.out.println("Patients:");
		Iterator<Patient> patientIterator = patients.iterator();
		while (patientIterator.hasNext()) {
			Patient p = patientIterator.next();
			p.print();
			System.out.println();
		}
	}
}