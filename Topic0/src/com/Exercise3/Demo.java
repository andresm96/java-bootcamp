package com.Exercise3;

import java.util.Map;

import com.Exercise3.Doctor.Speciality;
import com.Exercise3.Patient.Disease;

public class Demo {

	public static void main(String args[]) {

		Hospital hospital = Hospital.getInstance("Español");

		Doctor doctor = null;
		doctor = new Doctor("Alfred", Speciality.OPTHALMOLOGIST);
		hospital.addDoctor(doctor);
		doctor = new Doctor("Andrew", Speciality.SURGEON);
		hospital.addDoctor(doctor);
		doctor = new Doctor("Janet", Speciality.ENT);
		hospital.addDoctor(doctor);

		Patient patient = null;
		patient = new Patient("Mike B.", "Male", Disease.EARNOSE);
		hospital.addPatients(patient);
		patient = new Patient("Jeniffer", "Female", Disease.EYE);
		hospital.addPatients(patient);
		patient = new Patient("Kevin", "Male", Disease.HEART_PATIENT);
		hospital.addPatients(patient);
		
		hospital.assignPatientToDoctor();
		
		Map<Doctor.Speciality, Doctor> doctors = hospital.getDoctors();
		for (Doctor value : doctors.values()){
            value.print();
        }
	}
}
