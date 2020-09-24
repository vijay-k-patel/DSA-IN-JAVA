import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueOfArray {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            q.add(arr[i]);
        }
        System.out.println("Elements in queue "+ q);

        int remove= q.remove();
        System.out.println("Removed Element "+remove);
        System.out.println(q);

        int head=q.peek();
        System.out.println("Head of Queue " + head);

        int size=q.size();
        System.out.println("Size of Queue "+ size);
    }
}

