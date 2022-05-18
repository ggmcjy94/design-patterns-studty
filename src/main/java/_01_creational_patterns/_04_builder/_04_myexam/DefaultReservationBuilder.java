package _01_creational_patterns._04_builder._04_myexam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultReservationBuilder implements ReservationBuilder {

    private String hotelName;
    private String guestName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private List<Room> rooms;

    @Override
    public ReservationBuilder hotelName(String hotelName) {
        this.hotelName = hotelName;
        return this;
    }

    @Override
    public ReservationBuilder guestName(String guestName) {
        this.guestName = guestName;
        return this;
    }

    @Override
    public ReservationBuilder guestChecked(LocalDate checkedIn, LocalDate checkOut) {
        this.checkIn  = checkedIn;
        this.checkOut = checkOut;
        return this;
    }

    @Override
    public ReservationBuilder guestRoom(String roomNumber, String roomType) {
        if (rooms == null) {
            this.rooms = new ArrayList<>();
        }
        rooms.add(new Room(roomNumber, roomType));
        return this;
    }

    @Override
    public Reservation getReservation() {
        return new Reservation(hotelName, guestName, checkIn, checkOut , rooms);
    }
}
