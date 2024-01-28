package database;

import Models.Patient;

import java.util.HashMap;

public class patientDatabase {
    static HashMap<String, Patient> patientDb;
    public patientDatabase(){
        this.patientDb = new HashMap<>();
    }

    public static void addPatient(Patient obj){
        String pid = obj.getPid();
        patientDb.put(pid, obj);
    }
//    public Patient getPatient(String pid){
//        return patientDb.get(pid);
//    }
//
//}
   public static int getTotalPatients(){
        return patientDb.size();
    }
}