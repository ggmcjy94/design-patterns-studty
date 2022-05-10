package _02_factory._02_after;

public class Client {

    public static void main(String[] args) {

        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "hyunseok@mail.com");
        System.out.println(whiteship);

        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "hyunseok@mail.com");
        System.out.println(blackShip);

    }
}
