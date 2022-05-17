package _01_creational_patterns._03_abstract_factory._04_myexam;

public class BankFactory extends AbstractFactory{
    @Override
    public Bank getBank(String bank) {
        if(bank == null){
            return null;
        }
        if(bank.equalsIgnoreCase("KOOKMIN")) return new KOOKMIN();
        else if(bank.equalsIgnoreCase("WOORI")) return new WOORI();
        else if(bank.equalsIgnoreCase("SHINHAN"))return new SHINHAN();
        else if(bank.equalsIgnoreCase("HANA")) return new HANA();

        return null;


    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
