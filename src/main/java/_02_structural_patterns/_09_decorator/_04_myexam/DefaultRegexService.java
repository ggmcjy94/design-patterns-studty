package _02_structural_patterns._09_decorator._04_myexam;

public class DefaultRegexService implements RegexService{

    @Override
    public void addInput(String input) {
        System.out.println(input);
    }

}
