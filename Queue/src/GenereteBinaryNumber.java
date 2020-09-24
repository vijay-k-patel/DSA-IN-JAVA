import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenereteBinaryNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        while(n-->0){
            String s1=queue.peek();
            queue.remove();
            System.out.print(s1+" ");
            String s2=s1;
            queue.add(s1+ "0");
            queue.add(s2+ "1");
        }
    }
}
