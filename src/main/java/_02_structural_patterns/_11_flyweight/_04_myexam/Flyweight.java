package _02_structural_patterns._11_flyweight._04_myexam;

import java.util.HashMap;

public class Flyweight {

    private static final HashMap<String , Square> squares = new HashMap<>();

    public static Square getSquares(String color) {
        if (squares.containsKey(color)) {
            return squares.get(color);
        }
        Square square = new Square(color);
        squares.put(color, square);
        return square;
    }
}
