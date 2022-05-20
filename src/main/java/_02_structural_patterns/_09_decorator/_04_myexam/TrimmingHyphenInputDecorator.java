package _02_structural_patterns._09_decorator._04_myexam;

public class TrimmingHyphenInputDecorator extends RegexDecorator{


    public TrimmingHyphenInputDecorator(RegexService regexService) {
        super(regexService);
    }

    @Override
    public void addInput(String input) {
      super.addInput(trim(input));
    }

    private String trim(String input) {
        return input.replace("-", "");
    }
}
