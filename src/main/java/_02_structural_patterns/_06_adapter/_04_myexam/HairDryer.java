package _02_structural_patterns._06_adapter._04_myexam;

public class HairDryer implements Electronic110V{
    @Override
    public void powerOn() {
        System.out.println("헤이드라이기 110v On");
    }
}
