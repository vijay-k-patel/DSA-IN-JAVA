public class InsertElementAtNthNode {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public Node head;
    public void insert(int data,int position){
        Node newNode=new Node(data);
        if(position==1){
            newNode.next=head;
        }else {
            Node middle=head;
            int pos=1;
            while (pos<position-1){
                pos++;
                if(middle.next==null){
                    break;
                }
                middle=middle.next;
            }
            newNode.next=middle.next;
            middle.next=newNode;
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
        InsertElementAtNthNode list=new InsertElementAtNthNode();
        list.insert(20, 1);
        list.show();
    }
}
