package _01_creational_patterns._03_abstract_factory._04_myexam;

public class HANA implements Bank {

    private final String BNAME;

    public HANA() {
        this.BNAME = "HANA BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
