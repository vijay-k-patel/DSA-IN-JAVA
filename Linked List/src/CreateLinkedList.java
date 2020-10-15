public class CreateLinkedList {
    class Node{
        Node next;
        int data;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public Node head;

    public void addElement(int data){
        Node newNode=new Node(data);
        newNode.data=data;
        newNode.next=null;
        if(head==null){
            head=newNode;
        }else{
            Node node = head;
            while(node.next!=null){
                node=node.next;
            }
            node.next=newNode;
        }
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
        CreateLinkedList list=new CreateLinkedList();
        list.addElement(20);
        list.addElement(30);
        list.addElement(40);
        list.addElement(50);
        list.show();
    }
}
