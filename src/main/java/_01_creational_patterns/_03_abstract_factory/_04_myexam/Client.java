package _01_creational_patterns._03_abstract_factory._04_myexam;

//예제 https://xzio.tistory.com/883
//- 시스템이 객체의 생성, 구성 및 표현방법과 독립적이어야 하는 경우
//- 관련 객체 패밀리를 함께 사용해야하는 경우(필수)
//- 구현을 표시하지 않고 인터페이스 만 표시하는 오브젝트 라이브러리를 제공하려는 경우
//- 시스템을 여러객체의 패밀리 중 하나로 구성해야하는 경우

public class Client {


    public static void main(String[] args) {
        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank bank = bankFactory.getBank("KOOKMIN");
        System.out.println(bank);

        AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
        Loan loan = loanFactory.getLoan("Home");
        loan.getInterestRate(5);

        double loanAmount = 500000;
        int years = 20;

        loan.calculateLoanPayment(loanAmount, years);
    }
}
