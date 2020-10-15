public class InsertElementAtTail {
    class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public Node head;

    public void addElementAtTail(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }
    public void show(){
        Node node=head;
        while (node.next!=null){
            System.out.print(node.data+"->");
            node=node.next;
        }
        System.out.println(node.data);
    }
    public static void main(String[] args) {
        InsertElementAtTail list=new InsertElementAtTail();
        list.addElementAtTail(10);
        list.addElementAtTail(200);
        list.addElementAtTail(30);
        list.addElementAtTail(40);
        list.show();
    }
}
