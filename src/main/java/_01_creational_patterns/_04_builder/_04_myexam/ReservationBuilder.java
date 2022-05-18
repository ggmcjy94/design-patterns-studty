package _01_creational_patterns._04_builder._04_myexam;

import java.time.LocalDate;

public interface ReservationBuilder {

    ReservationBuilder hotelName(String hotelName);
    ReservationBuilder guestName(String guestName);
    ReservationBuilder guestChecked(LocalDate checkedIn, LocalDate checkOut);
    ReservationBuilder guestRoom(String roomNumber, String roomType);
    Reservation getReservation();
}
