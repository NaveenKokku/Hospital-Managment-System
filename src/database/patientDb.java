package database;

import Models.Patient;

import java.util.HashMap;

public class patientDatabase {
    HashMap<String, Patient> patientDb;
    patientDatabase(){
        this.patientDb = new HashMap<>();
    }

    public void addPatient(Patient obj){
        String pid = obj.getPid();
        patientDb.put(pid, obj);
    }
    public Patient getPatient(String pid){
        return patientDb.get(pid);
    }

}
