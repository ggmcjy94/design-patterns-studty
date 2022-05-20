package _02_structural_patterns._10_facade._04_myexam;

public class Light implements PowerSupply{

    private boolean turnedOn = false;
    @Override
    public void turnOn() {
        turnedOn = true;
        System.out.println("전등 on");
    }

    @Override
    public void turnOff() {
        turnedOn = false;
        System.out.println("전등 off");
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }
}
