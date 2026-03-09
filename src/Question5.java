import java.util.Scanner;
import java.util.Stack;

public class Question5 {// dibantu chatgpt untuk strukturnya
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int momentum = sc.nextInt();
            Stack<Integer> stackBom = new Stack<>();
            while (momentum > 0) {
                stackBom.push(momentum);
                momentum /= 2;
            }

            String hasil = "";

            while (!stackBom.isEmpty()) {
                hasil += stackBom.pop() + " ";
            }
            System.out.println(hasil.trim());
        }
        sc.close();
    }
}