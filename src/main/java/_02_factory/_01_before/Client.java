package _02_factory._01_before;

public class Client {

    public static void main(String[] args) {
        Ship whiteship = ShipFactory.orderShip("Whiteship", "hyunseok@gmail.com");
        System.out.println(whiteship);

        Ship blacship = ShipFactory.orderShip("Blackship", "hyunseok@gmail.com");
        System.out.println(blacship);
    }
}
