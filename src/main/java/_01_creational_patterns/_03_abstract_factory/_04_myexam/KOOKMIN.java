package _01_creational_patterns._03_abstract_factory._04_myexam;

public class KOOKMIN implements Bank {

    private final String BNAME;

    public KOOKMIN() {
        this.BNAME = "KOOKMIN BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
