package _02_structural_patterns._10_facade._04_myexam;

public class HomeFacade {

    private Computer computer;
    private Light light;
    private Radio radio;

    public HomeFacade(Computer computer, Light light, Radio radio) {
        this.computer = computer;
        this.light = light;
        this.radio = radio;
    }


    public void homeIn() {
        System.out.println("home In");
        System.out.println(computer.isTurnedOn());
        if (!computer.isTurnedOn()) computer.turnOn();
        System.out.println(computer.isTurnedOn());
        if (!light.isTurnedOn()) light.turnOn();
        if (!radio.isTurnedOn()) radio.turnOn();
    }

    public void homeOut() {
        System.out.println("home out");
        if (computer.isTurnedOn()) computer.turnOff();
        if (light.isTurnedOn()) light.turnOff();
        if (radio.isTurnedOn()) radio.turnOff();
    }

}
