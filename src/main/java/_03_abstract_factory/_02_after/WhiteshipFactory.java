package _03_abstract_factory._02_after;

import _02_factory._02_after.DefaultShipFactory;
import _02_factory._02_after.Ship;
import _02_factory._02_after.WhiteShip;
import _03_abstract_factory._01_before.WhiteAnchor;
import _03_abstract_factory._01_before.WhiteWheel;

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
