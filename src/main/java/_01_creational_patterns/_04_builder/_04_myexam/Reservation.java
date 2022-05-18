package _01_creational_patterns._04_builder._04_myexam;

import java.time.LocalDate;
import java.util.List;

public class Reservation {

    private String hotelName;
    private String guestName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private List<Room> rooms;

    public Reservation(String hotelName, String guestName, LocalDate checkIn, LocalDate checkOut, List<Room> rooms) {
        this.hotelName = hotelName;
        this.guestName = guestName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "hotelName='" + hotelName + '\'' +
                ", guestName='" + guestName + '\'' +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", rooms=" + rooms +
                '}';
    }
}
