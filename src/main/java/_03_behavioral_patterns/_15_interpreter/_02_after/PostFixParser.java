package _03_behavioral_patterns._15_interpreter._02_after;

import org.springframework.security.core.parameters.P;

import java.util.Stack;

public class PostFixParser {

    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            System.out.println(c);
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+':
                return new PlusExpression(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return new MinusExpression(left, right);
            case '*':
                PostfixExpression right1 = stack.pop();
                PostfixExpression left1 = stack.pop();
                return new MultiplyExpression(left1,right1);
            default:
                return new VariableExpression(c);

        }
    }
}
