package _01_creational_patterns._03_abstract_factory._02_after;

import _01_creational_patterns._02_factory._02_after.DefaultShipFactory;
import _01_creational_patterns._02_factory._02_after.Ship;
import _01_creational_patterns._02_factory._02_after.WhiteShip;

public class WhiteshipFactory extends DefaultShipFactory {


    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
