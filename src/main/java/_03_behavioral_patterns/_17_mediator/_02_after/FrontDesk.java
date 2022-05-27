package _03_behavioral_patterns._17_mediator._02_after;

import java.time.LocalDateTime;

public class FrontDesk {


    private CleaningService cleaningService = new CleaningService();
    private Restaurant restaurant = new Restaurant();


    public void getTowers(Guest guest, int numberOfTower) {
        cleaningService.getTowers(guest.getId(), numberOfTower);
    }


    public String getRoomNumberFor(Integer guestId) {
        return "111";
    }

    public void dinner(Guest guest, LocalDateTime dateTime) {
        restaurant.dinner(guest.getId(), dateTime);
    }
}
