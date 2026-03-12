package com.hospital.main;

import com.hospital.patient.Patient;
import com.hospital.service.HospitalService;
import com.hospital.exception.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HospitalService service = new HospitalService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Patient\n2. Display All\n3. Search ID\n4. Exit");
            int choice = sc.nextInt();

            try {
                if (choice == 1) {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    
                    if (age < 0 || age > 120) throw new InvalidAgeException("Invalid Age!");

                    System.out.print("Enter Disease: ");
                    String dis = sc.next();

                    Patient p = new Patient(id, name, age, dis);
                    service.addPatient(p);

                } else if (choice == 2) {
                    service.displayPatients();
                } else if (choice == 3) {
                    System.out.print("Enter ID to search: ");
                    service.searchPatient(sc.nextInt());
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
