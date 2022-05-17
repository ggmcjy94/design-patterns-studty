package _01_creational_patterns._03_abstract_factory._04_myexam;

public abstract class AbstractFactory {

    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);

}
