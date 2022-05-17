package _01_creational_patterns._02_factory._04_myexam;

public class SuperRobotFactory implements RobotFactory{

    @Override
    public Robot createRobot(Robot robot) {
        System.out.println(robot.getName() + "이 생산중입니다.");
        return robot;
    }
}
