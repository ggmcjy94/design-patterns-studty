package _02_structural_patterns._06_adapter._04_myexam;

public class Cleaner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("청소기 220v On");
    }
}
