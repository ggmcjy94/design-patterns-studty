package _03_behavioral_patterns._15_interpreter._03_after;

import _03_behavioral_patterns._15_interpreter._02_after.MultiplyExpression;

import java.util.Stack;

public class PostFixParser {

    public static PostfixExpression parse(String expression) {
        Stack<PostfixExpression> stack = new Stack<>();
        for (char c : expression.toCharArray()) {
            stack.push(getExpression(c, stack));
        }
        return stack.pop();
    }

    private static PostfixExpression getExpression(char c, Stack<PostfixExpression> stack) {
        switch (c) {
            case '+':
                return PostfixExpression.plus(stack.pop(), stack.pop());
            case '-':
                PostfixExpression right = stack.pop();
                PostfixExpression left = stack.pop();
                return PostfixExpression.minus(left, right);
            case '*':
                PostfixExpression right1 = stack.pop();
                PostfixExpression left1 = stack.pop();
                return PostfixExpression.multiply(left1,right1);
            default:
                return PostfixExpression.variable(c);

        }
    }
}
