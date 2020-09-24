import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StrangeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        int N=Integer.parseInt(n);
        Queue<Character>queue=new LinkedList<>();
        Stack<Character> stack=new Stack<>();
        char a=97;
        for (int i = 1; i <N+1 ; i++) {
            if (a > 122) {
                a = 97;
            }
            if (i % 2 == 0) {
                queue.add(a);
                a++;
            } else if (i % 2 == 1) {
                stack.push(a);
                a++;
            }
        }
            while (!stack.isEmpty()){
                System.out.print(stack.pop());
            }
            while (queue.size()!=0) {
                System.out.print(queue.remove());
            }
        }
    }
