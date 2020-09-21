public class CreateStack {
    public int stack[]=new int[3];
    public int top=0;
     void push(int data){
        if(top==3){
            System.out.println("Stack is Full");
        }else{
            stack[top]=data;
            top++;
        }
    }
    int pop(){
         int data=0;
         if(isEmpty()){
             System.out.println("Stack is Empty");
         }else{
             top--;
             data=stack[top];
             stack[top]=-1;
         }
         return data;
    }
    int peek(){
         int data;
         data=stack[top];
         return data;
    }
    int size(){
         return top;
    }
    boolean isEmpty(){
         return top<=0;
    }
    void show(){
         for (int n:stack){
             System.out.println(n+" ");
         }
        System.out.println();
    }
    public static void main(String[] args) {
        CreateStack cs=new CreateStack();
        cs.push(1);
        cs.push(3);
        cs.push(2);
        cs.show();
        cs.pop();
        cs.show();
    }
}
