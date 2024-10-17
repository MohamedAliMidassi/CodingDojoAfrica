package com.codingdojo.demo;


import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	private ArrayList<String> patientNotes;
	
	// TO DO: Constructor that takes an IDcopy
	public Physician (int id) {
		super(id);
		this.patientNotes = new ArrayList<>();
	}
	
	public boolean assignPIN(int pin) {
		if(String.valueOf(pin).length() != 4) {
			return false;
		}
		super.setPin(pin);
		return true;
	}
	
	public boolean accessAuthorized(Integer id) {
		return id.equals(super.getId());
	}
	
	
	
	
	

	
	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
	
    // TO DO: Setters & Getters
	public ArrayList<String> getPatientNotes(){
		return patientNotes;
	}
	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
}

