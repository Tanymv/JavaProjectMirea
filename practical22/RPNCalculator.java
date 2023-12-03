package practical22;

import java.util.Stack;

public class RPNCalculator {
    public static double calculate(String expression) {
        String[] tokens = expression.split(" ");
        Stack<Double> stack = new Stack<>();

        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();

                double result = switch (token) {
                    case "+" -> operand1 + operand2;
                    case "-" -> operand1 - operand2;
                    case "*" -> operand1 * operand2;
                    case "/" -> operand1 / operand2;
                    default -> throw new IllegalArgumentException("Invalid operator: " + token);
                };

                stack.push(result);
            }
        }

        return stack.pop();
    }

    private static boolean isNumeric(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        String expression = "5 6 7 + *";
        double result = calculate(expression);
        System.out.println("Result: " + result);
    }
}
