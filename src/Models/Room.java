package Models;

public class Room {
    String roomId;
    boolean isOccupied;
    Patient patient;
    Doctor doctor;
    String acorNac;

    public Room(String roomId, boolean isOccupied, Patient patient, Doctor doctor, String acorNac) {
        this.roomId = roomId;
        this.isOccupied = isOccupied;
        this.patient = patient;
        this.doctor = doctor;
        this.acorNac = acorNac;

    }
}
