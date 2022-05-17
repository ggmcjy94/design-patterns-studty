package _01_creational_patterns._03_abstract_factory._04_myexam;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Bank")) return new BankFactory();
        else if (choice.equalsIgnoreCase("Loan")) return new LoanFactory();
        return null;
    }
}
