
public class InsertElementAtHead {
    class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public Node head;

    public void AddAtHead(int data){
        Node newHead=new Node(data);
        newHead.next=head;
        head=newHead;

    }

    public void show(){
        Node node = head;
        while (node.next!=null){
            System.out.print(node.data+"->");
            node=node.next;
        }
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        InsertElementAtHead list=new InsertElementAtHead();
        list.AddAtHead(10);
        list.AddAtHead(5);
        list.AddAtHead(255);
        list.AddAtHead(555);
        list.show();
    }
}
