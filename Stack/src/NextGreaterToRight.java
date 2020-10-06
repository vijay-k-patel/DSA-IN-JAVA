import java.util.Scanner;
import java.util.Stack;

public class NextGreaterToRight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] a=new int[n];
        int [] r=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        Stack<Integer> st=new Stack<>();
        for(int i=(n-1);i>=0;i--){
            int curr=a[i];
            while(!st.empty() && st.peek() <= curr){
                st.pop();
            }
            if(st.empty()){
                r[i]=-1;
            }else{
                r[i]=st.peek();
            }
            st.push(curr);
        }
        for(int i=0;i<n;i++){
            System.out.print(r[i]+ " ");
        }
        System.out.println();
    }
}
