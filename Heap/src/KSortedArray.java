import java.util.PriorityQueue;
import java.util.Scanner;

public class KSortedArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            int n = scanner.nextInt();//number of element in array
            int[] arr = new int[n];
            int k = scanner.nextInt();//get total number of largest from array
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            PriorityQueue<Integer> pq=new PriorityQueue<>();
            for (int i = 0; i <=k ; i++) {
                pq.add(arr[i]);
            }
            for (int i = k+1; i < n; i++) {
                System.out.println(pq.remove());
                pq.add(arr[i]);
            }
            while (pq.size()>0){
                System.out.println(pq.remove());
            }
        }
    }

