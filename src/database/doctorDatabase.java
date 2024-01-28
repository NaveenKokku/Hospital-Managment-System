package database;

import Models.Doctor;
import Models.Patient;

import java.util.HashMap;
import java.util.List;

public  class doctorDatabase {
    static HashMap<String, Doctor> doctorDb;
    public doctorDatabase(){
        this.doctorDb = new HashMap<>();
    }

    public static Doctor getMinPatientDoctor(){
        Doctor minDoc = null;
        int min = Integer.MAX_VALUE;
        for(String key : doctorDb.keySet()){
            Doctor doc = doctorDb.get(key);
            List<Patient> patientList = doc.getPatientList();
            if(patientList.size() < min){
                minDoc = doc;
                min = patientList.size();
            }
        }
        return minDoc;
    }
    public static int getDoctorsCount(){
        return doctorDb.size();
    }

    public static void appointNewDoctor(Doctor doctor){
        String docId = doctor.getdId();
        doctorDb.put(docId, doctor);
    }

}
