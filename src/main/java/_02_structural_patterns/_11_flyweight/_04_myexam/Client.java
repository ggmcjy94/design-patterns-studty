package _02_structural_patterns._11_flyweight._04_myexam;


//FlyWeight Pattern 플라이웨이트 패턴
//구조 패턴으로, 객체마다 모든 데이터를 저장하지 않고 공통된 부분은 공유할 수 있도록 해주는 패턴입니다.
//주로 객체 생성 횟수를 줄이고, 메모리 사용량을 줄이고 성능을 개선하기 위해 사용합니다.
//flyweight 객체가 생성된 객체의 목록을 관리합니다.  비슷한 종류의 객체가 있다면 재사용하고, 없으면 새로 생성합니다.
//예를 들어 객체 목록을 HashMap으로 가지고 있으면서, 동일한(비슷한) 객체가 있다면 그 객체를 재사용(get)하고 없으면 새로 생성 (put) 합니다.
//장점 RAM 메모리를 관리할 수 있습니다.
//단점 flyweight의 메소드를 호출할때마다 데이터가 계산되어야 하는 경우, RAM의 작동량이 CPU 사이클을 넘어설 수도 있습니다.
public class Client {
    public static void main(String[] args) {

        Square 빨강 = new Square("빨강");
        Square 빨강1 = new Square("빨강");
        System.out.println(빨강);
        System.out.println(빨강1);


        Square redSquare = Flyweight.getSquares("빨강");
        System.out.println(redSquare); // 같은 객체
        Square blueSquare = Flyweight.getSquares("블루");
        System.out.println(blueSquare);
        Square redSquare2 = Flyweight.getSquares("빨강");
        System.out.println(redSquare2); // 같은 객체

    }
}
