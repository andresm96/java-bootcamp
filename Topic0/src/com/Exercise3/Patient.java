package com.Exercise3;

public class Patient {

	private String name;
	private String gender;
	private Disease disease;

	public enum Disease {
		EYE, HEART_PATIENT, EARNOSE
	}

	public Patient(String name, String gender, Disease disease) {
		this.name = name;
		this.gender = gender;
		this.disease = disease;
	}

	public Disease getDisease() {
		return disease;
	}

	public void setDisease(Disease disease) {
		this.disease = disease;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void print() {
		System.out.println("Name: " + name + " Gender :" + gender + " Disease :" + disease);
	}
}
