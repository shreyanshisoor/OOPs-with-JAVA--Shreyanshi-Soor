package com.hospital.service;

import com.hospital.patient.Patient;
import com.hospital.exception.*;
import java.io.*;
import java.util.*;

public class HospitalService {
    ArrayList<Patient> list = new ArrayList<>();
  
    public void addPatient(Patient p) throws DuplicatePatientException, IOException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).patientId == p.patientId) {
                throw new DuplicatePatientException("ID already exists!");
            }
        }
      
        if (p.age > 60 && p.disease.equalsIgnoreCase("Heart Problem")) {
            System.out.println("Priority Patient – Immediate Attention Required");
        }

        list.add(p);
      
        FileWriter fw = new FileWriter("patients.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(p.patientId + "," + p.patientName + "," + p.age + "," + p.disease);
        bw.newLine();
        bw.close();
    }

    public void searchPatient(int id) throws PatientNotFoundException {
        for (Patient p : list) {
            if (p.patientId == id) {
                p.displayPatient();
                return;
            }
        }
        throw new PatientNotFoundException("Patient not found!");
    }

    public void displayPatients() {
        for (Patient p : list) {
            p.displayPatient();
        }
    }
}
