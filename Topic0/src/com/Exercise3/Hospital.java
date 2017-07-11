package com.Exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.Exercise3.Doctor.Speciality;
import com.Exercise3.Patient.Disease;

public class Hospital {

	/*
	 * I made this class Singleton
	 */

	private static Hospital hospital = null;
	private String name;

	static Map<Patient.Disease, Doctor.Speciality> specialityHandlingForDisease = new HashMap<Patient.Disease, Doctor.Speciality>();
	Map<Doctor.Speciality, Doctor> doctors = new HashMap<Doctor.Speciality, Doctor>();
	List<Patient> patients = new ArrayList<Patient>();

	static {
		specialityHandlingForDisease.put(Disease.EYE, Speciality.OPTHALMOLOGIST);
		specialityHandlingForDisease.put(Disease.HEART_PATIENT, Speciality.SURGEON);
		specialityHandlingForDisease.put(Disease.EARNOSE, Speciality.ENT);
	}

	public void addDoctor(Doctor doctor) {
		doctors.put(doctor.getSpeciality(), doctor);
	}

	public String getName() {
		return name;
	}

	public Map<Doctor.Speciality, Doctor> getDoctors() {
		return doctors;
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void addPatients(Patient patient) {
		patients.add(patient);
	}

	private Hospital(String name) {
		this.name = name;
	}

	public static Hospital getInstance(String name) { // Singleton Pattern
		if (hospital == null) {
			hospital = new Hospital(name);
		}
		return hospital;
	}

	public void assignPatientToDoctor() {

		/*
		 * I assume there is a doctor per specialty. Firstly, I add a patient to
		 * the hospital list and then, assign all of them to a doctor.
		 */

		for (Patient patient : patients) {
			if (specialityHandlingForDisease.containsKey(patient.getDisease())) {
				Speciality speciality = specialityHandlingForDisease.get(patient.getDisease());
				if (doctors.containsKey(speciality)) {
					doctors.get(speciality).addPatients(patient);
				}
			}
		}
	}
}
