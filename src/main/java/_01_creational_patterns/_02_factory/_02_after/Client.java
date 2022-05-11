package _01_creational_patterns._02_factory._02_after;

public class Client {

    public static void main(String[] args) {


        Client client = new Client();
        client.print(new WhiteShipFactory(), "whiteship", "hyunseok@mail.com");
        client.print(new BlackShipFactory(), "BlackShip", "hyunseok@email.com");

//        Ship whiteship = new WhiteShipFactory().orderShip("Whiteship", "hyunseok@mail.com");
//        System.out.println(whiteship);
//
//        Ship blackShip = new BlackShipFactory().orderShip("BlackShip", "hyunseok@mail.com");
//        System.out.println(blackShip);
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));

    }
}
