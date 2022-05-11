package _01_creational_patterns._02_factory._03_java;

import _01_creational_patterns._02_factory._02_after.BlackShip;
import _01_creational_patterns._02_factory._02_after.WhiteShip;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new WhiteShip();
        } else if (name.equals("blackship")) {
            return new BlackShip();
        }
        return new IllegalArgumentException();
    }
}
