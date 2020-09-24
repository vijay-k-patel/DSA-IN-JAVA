/*
Input:
1
3 1
4 7 8
Output:
8
*/
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLegestElemnintInArray {
    public static void main(String[] args)  {
        Scanner scanner=new Scanner(System.in);
            int n = scanner.nextInt();//number of element in array
            int[] arr = new int[n];
            int k = scanner.nextInt();//get total number of largest from array
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < arr.length; i++) {
                if (i < k) {
                    pq.add(arr[i]);
                } else {
                    if (arr[i] > pq.peek()) {
                        pq.remove();
                        pq.add(arr[i]);
                    }
                }
            }
            while (pq.size() > 0) {
                System.out.println(pq.remove());
            }
        }
    }

