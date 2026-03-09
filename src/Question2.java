import java.util.Stack;

class testcase2 {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>(); // Create new Stack

        for (String token : s.split("")) { // Loops to split the string into tokens and push into the stack
            if (!"+-*/".contains(token)) {
                stack.push(Integer.valueOf(token));
                continue;
            }

            int b = stack.pop();
            int a = stack.pop();

            stack.push(calculate(a, b, token)); // Push the result back into the stack
        }
        return stack.pop(); // Return the final result
    }

    public int calculate(int a, int b, String operator) {// Switch case for operations
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }
}

public class Question2 { // idea from myself, code implementation from youtube
    public static void main(String[] args) {
        testcase2 t = new testcase2();
        System.out.println(t.solution("12+3*"));
        System.out.println(t.solution("12+3*45+6/7-"));
        System.out.println(t.solution("12+3*45+6/7-8*"));
        System.out.println(t.solution("12+3*45+6/7-8*9/"));
    }
}