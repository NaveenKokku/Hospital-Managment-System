package database;

import Models.Patient;
import Models.Room;

import java.util.HashMap;

public class roomDatabase {
    static HashMap<String, Room> roomDb;

    public roomDatabase(){
        this.roomDb = new HashMap<>();
    }
     public static Room getUnoccupiedRoom(){
        for(String key : roomDb.keySet()){
            Room room = roomDb.get(key);
            if(!room.isOccupied()){
                return room;
            }
        }
        return null;
     }

     public static int getRoomcount(){
        return roomDb.size();
     }

     public static void addRoomToDb(Room room){
        String roomId = room.getRoomId();
        roomDb.put(roomId, room);
     }



//    public boolean isOccupied(String roomId){
//        boolean occupied = roomDb.get(roomId);
//    }


}
