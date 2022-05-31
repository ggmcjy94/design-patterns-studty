package _03_behavioral_patterns._23_visitor._01_before;

public class Client {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Shape triangle =new Triangle();

        Device device = new Phone();

        rectangle.printTo(device);
    }
}
