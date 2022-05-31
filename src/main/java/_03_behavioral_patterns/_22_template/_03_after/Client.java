package _03_behavioral_patterns._22_template._03_after;

public class Client {

    // 템플릿 콜백 패턴
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process(new Plus());
        System.out.println(result);
    }
}
