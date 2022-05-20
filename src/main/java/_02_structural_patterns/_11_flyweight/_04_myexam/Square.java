package _02_structural_patterns._11_flyweight._04_myexam;

public class Square implements Shape{

    private String color;

    public Square(String color) {
        this.color = color;
    }

    @Override
    public String draw() {
        return color + " 네모";
    }
}
