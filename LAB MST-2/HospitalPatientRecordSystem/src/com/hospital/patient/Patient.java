package com.hospital.patient;

public class Patient {
    public int patientId;
    public String patientName;
    public int age;
    public String disease;

    public Patient(int id, String name, int age, String disease) {
        this.patientId = id;
        this.patientName = name;
        this.age = age;
        this.disease = disease;
    }

    public void displayPatient() {
        System.out.println("ID: " + patientId + ", Name: " + patientName + ", Age: " + age + ", Disease: " + disease);
    }
}
