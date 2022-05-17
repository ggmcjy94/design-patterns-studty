package _01_creational_patterns._03_abstract_factory._04_myexam;

public class SHINHAN implements Bank {

    private final String BNAME;

    public SHINHAN() {
        this.BNAME = "WOORI BANK";
    }

    @Override
    public String getBankName() {
        return BNAME;
    }
}
