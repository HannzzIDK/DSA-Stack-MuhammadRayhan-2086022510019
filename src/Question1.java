import java.util.Stack;

public class Question1 {// idea from myself, code implementation from youtube
    public boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();// create new stack

        for (int i = 0; i < str.length(); i++) {// loop through string
            if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {// check if it is an opening
                                                                                       // bracket and push into the
                                                                                       // stack
                stack.push(str.charAt(i));
            } else {
                if (stack.isEmpty()) {// check if the stack is empty
                    return false;
                }
                if (str.charAt(i) == ')' && stack.peek() != '(' || str.charAt(i) == ']' && stack.peek() != '['
                        || str.charAt(i) == '}' && stack.peek() != '{') {// check if the closing bracket matches the
                                                                         // opening bracket
                    return false;
                }
                stack.pop();// pop the opening bracket
            }
        }
        return stack.isEmpty();// return true if the stack is empty, it basically returns false if the stack is
                               // not empty
    }
}

class testcase {// testcase class
    public static void main(String[] args) {

        Question1 q1 = new Question1();
        System.out.println(q1.isBalanced("{[()]}")); // sample case
        System.out.println(q1.isBalanced("([)]")); // custom case 1
        System.out.println(q1.isBalanced("{[]}")); // custom case 2
    }
}