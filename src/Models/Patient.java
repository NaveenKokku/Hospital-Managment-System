package Models;

public class Patient {
    String pid;
    String name;
    int age;
    Long phoneNumber;
    String disease;
    String gender;
    String email;
    Doctor doctor;
    Room room;

    public Patient(String pid, String name, int age, Long phoneNumber, String disease, String gender, String email, Doctor doctor, Room room) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.disease = disease;
        this.gender = gender;
        this.email = email;
        this.doctor = doctor;
        this.room = room;
    }

    public String getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getDisease() {
        return disease;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Room getRoom() {
        return room;
    }
}
