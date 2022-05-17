package _02_structural_patterns._11_flyweight._02_after;

public class Character {

    private char value;

    private String color;

    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }

    @Override
    public String toString() {
        return "Character{" +
                "value=" + value +
                ", color='" + color + '\'' +
                ", font=" + font +
                '}';
    }
}
