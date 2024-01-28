// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import Models.Hospital;

public class Main {
    public static void main(String[] args) {

        Hospital h = new Hospital("Kamineni", "L.B Nagar", 9966L, "kmaineuie");
        h.appointDoctor("DR. Sreeja","MBBS", 10000, 9966L, "Cardiology","10-4pm");
        h.createRoom();
        h.admitPatient("Ninja", 49, 9800L, "cancer", "female", "abyivahbi");

        }
    }
