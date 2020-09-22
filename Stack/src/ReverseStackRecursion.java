import java.util.Stack;

public class ReverseStackRecursion {
    static Stack<Character> stack=new Stack<>();
    static void insertAtBottom(char x){
        if(stack.isEmpty()){
            stack.push(x);
        }else{
            char a=stack.peek();
            stack.pop();
            insertAtBottom(x);
            stack.push(a);
        }
    }
    static void reverse(){
        if(stack.size() > 0){
            char x=stack.peek();
            stack.pop();
            reverse();
            insertAtBottom(x);
        }
    }
    public static void main(String[] args) {
        stack.push('1');
        stack.push('A');
        stack.push('2');
        stack.push('B');
        System.out.println(stack);
        reverse();
        System.out.println(stack);
    }
}
