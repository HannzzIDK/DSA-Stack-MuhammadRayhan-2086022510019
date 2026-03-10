import java.util.Stack;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] tokens = str.split(" ");

        Stack<Integer> stack = new Stack<>();
        int[] tempArray = new int[tokens.length];
        for (String token : tokens) {
            int num = Integer.parseInt(token);
            int tempSize = 0;
            while (!stack.isEmpty() && stack.peek() < num) {
                tempArray[tempSize++] = stack.pop();
            }
            stack.push(num);
            for (int i = tempSize - 1; i >= 0; i--) {
                stack.push(tempArray[i]);
            }
        }
        String result = "";
        while (!stack.isEmpty()) {
            result += stack.pop() + " ";
        }
        System.out.println(result);
        sc.close();
    }
}
