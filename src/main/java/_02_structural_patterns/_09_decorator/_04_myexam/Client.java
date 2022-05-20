package _02_structural_patterns._09_decorator._04_myexam;

public class Client {

    RegexService regexService;

    public Client(RegexService regexService) {
        this.regexService = regexService;
    }

    public void writeComment(String s) {
        regexService.addInput(s);
    }
}
