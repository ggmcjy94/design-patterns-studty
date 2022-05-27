package _03_behavioral_patterns._15_interpreter._03_after;

import java.util.Map;

public class App {

    public static void main(String[] args) {
        PostfixExpression expression = PostFixParser.parse("xyz*-a+q-");
        int result = expression.interpret(Map.of('x',1,'y',2,'z',3,'a',4,'q',5));
        System.out.println(result);
    }
}
