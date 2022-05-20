package _02_structural_patterns._09_decorator._04_myexam;

public class RegexDecorator implements RegexService{

    private RegexService regexService;

    public RegexDecorator(RegexService regexService) {
        this.regexService = regexService;
    }

    @Override
    public void addInput(String input) {
        regexService.addInput(input);
    }
}
