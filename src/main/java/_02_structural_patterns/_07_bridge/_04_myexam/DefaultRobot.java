package _02_structural_patterns._07_bridge._04_myexam;

public class DefaultRobot implements Play{

    private Robot robot;
    private String name;


    public DefaultRobot(Robot robot, String name) {
        this.robot = robot;
        this.name = name;
    }


    @Override
    public void powerOn() {
        System.out.printf("%s %s powerOn\n", robot.getName(), name);
    }

    @Override
    public void powerOff() {

        System.out.printf("%s %s powerOFF\n", robot.getName(), name);
    }

    @Override
    public void right() {
        System.out.printf("%s %s right\n", robot.getName(), name);
    }

    @Override
    public void left() {
        System.out.printf("%s %s left\n", robot.getName(), name);
    }

    @Override
    public void front() {
        System.out.printf("%s %s front\n", robot.getName(), name);
    }

    @Override
    public void back() {
        System.out.printf("%s %s back\n", robot.getName(), name);
    }

    @Override
    public String getName() {
        return null;
    }
}
