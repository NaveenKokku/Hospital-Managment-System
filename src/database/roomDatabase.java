package database;

import Models.Patient;

import java.util.HashMap;

public class roomDatabase {
    HashMap<String, Patient> roomDb;

    roomDatabase(){
        this.roomDb = new HashMap<>();
    }

//    public boolean isOccupied(String roomId){
//        boolean occupied = roomDb.get(roomId);
//    }

}
