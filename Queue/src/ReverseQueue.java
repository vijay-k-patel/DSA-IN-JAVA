import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        int n=scanner.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
            queue.add(arr[i]);
        }
        while (! queue.isEmpty()){
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()){
            queue.add(stack.peek());
            stack.pop();
        }
        while (!queue.isEmpty()) {
            System.out.print( queue.peek() + " ");
            queue.remove();
        }
    }
}

