package Models;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    String dId;
    String name;
    String degree;
    int salary;
    Long phoneNumber;
    String speciality;
    String timeSlot;
    List<Patient> patientList;

    public Doctor(String dId, String name, String degree, int salary, Long phoneNumber, String speciality, String timeSlot, List<Patient> patientList) {
        this.dId = dId;
        this.name = name;
        this.degree = degree;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;
        this.timeSlot = timeSlot;
        this.patientList = new ArrayList<>();
    }
}
