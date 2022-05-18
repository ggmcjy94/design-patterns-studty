package _01_creational_patterns._04_builder._04_myexam;

import java.time.LocalDate;

public class ReservationDirector {

    private ReservationBuilder reservationBuilder;

    public ReservationDirector(ReservationBuilder reservationBuilder) {
        this.reservationBuilder = reservationBuilder;
    }


    public Reservation newReservation() {
        return reservationBuilder
                .hotelName("리호텔")
                .guestName("이현석")
                .guestChecked(LocalDate.of(2022, 10, 8), LocalDate.of(2022, 10, 10))
                .guestRoom("312","parkView")
                .getReservation();
    }
}
