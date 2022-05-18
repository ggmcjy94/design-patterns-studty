package _01_creational_patterns._04_builder._04_myexam;

public class Client {


    public static void main(String[] args) {
        ReservationDirector reservationDirector = new ReservationDirector(new DefaultReservationBuilder());
        Reservation reservation = reservationDirector.newReservation();
        System.out.println("reservation = " + reservation);
    }
}
