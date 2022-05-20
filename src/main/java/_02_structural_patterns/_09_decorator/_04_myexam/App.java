package _02_structural_patterns._09_decorator._04_myexam;

public class App {

    private static final boolean HYPHEN_REGEX = true;

    public static void main(String[] args) {
        RegexService regexService = new DefaultRegexService();

        if (HYPHEN_REGEX) {
            regexService = new TrimmingHyphenInputDecorator(regexService);
        }

        Client client = new Client(regexService);
        client.writeComment("010-7152-6524");
    }
}
