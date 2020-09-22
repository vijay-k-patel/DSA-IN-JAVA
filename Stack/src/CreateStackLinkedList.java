import static java.lang.System.exit;
public class CreateStackLinkedList {
    public class Node{
        int data;
        Node next;
    }
    Node top=null;
    void push(int x){
        Node inserted=new Node();
        if(inserted==null){
            System.out.println("OverFlow");
        }
        inserted.data=x;
        inserted.next=top;
        top=inserted;
    }
    boolean isEmpty(){
        return top==null;
    }
    int peek(){
        if(!isEmpty()){
            return top.data;
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    void pop(){
        if(top==null){
            System.out.println("Underflow");
            return;
        }
        top=top.next;
    }
    void display(){
        if(top==null){
            System.out.println("Underflow");
            exit(1);
        }else{
            Node temp=top;
            while(temp != null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        CreateStackLinkedList obj=new CreateStackLinkedList();
        obj.push(11);
        obj.push(12);
        obj.push(13);
        obj.display();
        System.out.println("\n"+obj.peek());
        obj.pop();
        obj.display();
        System.out.println("\n"+obj.peek());
    }
}
