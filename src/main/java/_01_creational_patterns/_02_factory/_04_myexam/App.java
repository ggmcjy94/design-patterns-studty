package _01_creational_patterns._02_factory._04_myexam;

public class App {
    // https://dev-youngjun.tistory.com/195
    // 객체를 만드러내는 부분을 서브 클래스에 위임하는 패턴
    // new 키워드를 호출하는 부분을 서브 클래스에 위임하는 것 결국 팩토리 메소드 패턴은 객체를 만들어내는 공장을 만드는 패턴
    public static void main(String[] args) {
        RobotFactory robotFactory = new SuperRobotFactory();
        Robot superRobot = robotFactory.createRobot(new SuperRobot());
        System.out.println(superRobot);

        RobotFactory robotFactory2 = new PowerRobotFactory();
        Robot powerRobot = robotFactory2.createRobot(new PowerRobot());
        System.out.println(powerRobot);


    }


}
