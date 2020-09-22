import java.util.Scanner;
import java.util.Stack;

public class LongestBrackets {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int result = 0;
        for (int i = 0; i < n; i++) {
            if(str.charAt(i)=='('){
                stack.push(i);
            }else{
                stack.pop();
                if(!stack.empty()){
                    result=Math.max(result, i-stack.peek());
                }else{
                    stack.push(i);
                }
            }
        }
        System.out.println(result);
    }
}
