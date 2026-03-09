import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] tokens = str.split(" ");

        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> tempArray = new ArrayList<>();
        for (String token : tokens) {
            int num = Integer.parseInt(token);
            while (!stack.isEmpty() && stack.peek() < num) {
                tempArray.add(stack.pop());
            }
            stack.push(num);
            for (int i = tempArray.size() - 1; i >= 0; i--) {
                stack.push(tempArray.get(i));
            }
            tempArray.clear();
        }
        String result = "";
        while (!stack.isEmpty()) {
            result += stack.pop() + " ";
        }
        System.out.println(result);
        sc.close();
    }
}
