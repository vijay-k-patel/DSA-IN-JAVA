import java.util.Scanner;
import java.util.Stack;

public class NextGreaterToLeft {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int [] a=new int[n];
        int [] r=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int curr=a[i];
            while (!stack.empty() && stack.peek() <= curr){
                stack.pop();
            }
            if(stack.empty()){
                r[i]=-1;
            }else{
                r[i]=stack.peek();
            }
            stack.push(curr);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(r[i]+" ");
        }
        System.out.println();
    }
}
