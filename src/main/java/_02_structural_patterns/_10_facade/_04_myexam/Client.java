package _02_structural_patterns._10_facade._04_myexam;

public class Client {

    public static void main(String[] args) {

        Computer computer = new Computer();
        Radio radio = new Radio();
        Light light = new Light();


        HomeFacade homeFacade = new HomeFacade(computer, light, radio);
        homeFacade.homeIn();

    }
}
