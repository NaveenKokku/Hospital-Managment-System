package Models;

import database.roomDatabase;
import database.doctorDatabase;
import database.patientDatabase;

public class Hospital {
    private String name;
    private String adress;
    private Long phoneNumber;
    private String emailId;
    private doctorDatabase doctordatabase;
    private patientDatabase patientdatabase;
    private roomDatabase roomdatabase;


    public Hospital(String name, String adress, Long phoneNumber, String emailId) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.roomdatabase = new roomDatabase();
        this.patientdatabase = new patientDatabase();
        this.doctordatabase = new doctorDatabase();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public void admitPatient(String name, int age, Long phoneNumber, String disease, String gender, String email ){
        //patient will provide this details
        //now hospital responsibility to allocate doctor
        //and allocate room and giving unique id
        //after getting all the details we create obj
        //the patient database is used to store the details of the patient

        //Patient p1 = new Patient();
        int totalPatientCount = patientDatabase.getTotalPatients()+1;
        String pid = "PID"+ totalPatientCount;
        Doctor doctor = doctorDatabase.getMinPatientDoctor();
        Room room = roomDatabase.getUnoccupiedRoom();
        Patient p = new Patient(pid, name, age, phoneNumber, disease, gender, email, doctor, room, false);
        patientDatabase.addPatient(p);
        doctor.patientList.add(p);
        System.out.println("Patient got Admitted Successfully");

    }

    public void createRoom(){
       String roomId = "RID"+ (roomDatabase.getRoomcount()+1);
       Room room = new Room(roomId, false, null, null, "AC");
       roomDatabase.addRoomToDb(room);
       System.out.println("Room Created Successfully");
    }

    public void appointDoctor(String name, String degree, int salary, Long phoneNumber, String speciality, String timeSlot){
        String docId = "DOCID"+(doctorDatabase.getDoctorsCount()+1);
        Doctor doc = new Doctor(docId, name, degree, salary, phoneNumber, speciality, timeSlot);
        doctorDatabase.appointNewDoctor(doc);
        System.out.println("Doctor got appointed successfully");
    }
}
