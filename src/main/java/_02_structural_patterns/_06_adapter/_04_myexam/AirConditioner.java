package _02_structural_patterns._06_adapter._04_myexam;

public class AirConditioner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("에어컨 220v On");
    }
}
