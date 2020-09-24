import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDefalut {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int [] ranks= {22,32,46,1,2,56,70,90,87,645,10,7,4,9};
        for (int val:
             ranks) {
            pq.add(val);
        }
        while (pq.size()>0){
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
}
