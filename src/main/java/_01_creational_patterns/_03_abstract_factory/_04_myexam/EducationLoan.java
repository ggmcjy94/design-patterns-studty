package _01_creational_patterns._03_abstract_factory._04_myexam;

public class EducationLoan extends Loan {
    @Override
    void getInterestRate(double r) {
        rate = r;
    }
}
