package _03_behavioral_patterns._22_template._02_after;

public class Client {
    //템플릿 메소드 패턴
    public static void main(String[] args) {
        FileProcessor fileProcessor = new Multiply("number.txt");
        int result = fileProcessor.process();
        System.out.println(result);
    }
}
