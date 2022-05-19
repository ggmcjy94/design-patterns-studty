package _02_structural_patterns._07_bridge._04_myexam;

public class Client {

    public static void main(String[] args) {
        Robot1 powerRobot1 = new Robot1(new Power());
        powerRobot1.powerOn();
        powerRobot1.front();
        Robot1 freeRobot1 = new Robot1(new Free());
        freeRobot1.powerOn();
        Robot2 freeRobot2 = new Robot2(new Free());
        freeRobot2.powerOn();
        Robot3 powerRobot3 = new Robot3(new Power());
        powerRobot3.powerOn();


    }
}
