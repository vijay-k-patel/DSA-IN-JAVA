public class CreateQueue {
    int queue[]=new int[3];
    int size;
    int front;
    int rear;

    public void enQueue(int data){
        queue[rear]=data;
        rear++;
        size++;
    }
    public int deQueue(){
        int data=queue[front];
        front++;
        size--;

        return data;
    }

    public void show(){
        for (int i = 0; i < size; i++) {
            System.out.print(queue[front+i]+" ");
        }
        System.out.println();
        for(int n:queue){
            System.out.print(n +" ");
        }
    }

    public static void main(String[] args) {
        CreateQueue cq=new CreateQueue();
        cq.enQueue(5);
        cq.enQueue(15);
        cq.enQueue(10);
        cq.deQueue();

        cq.show();

    }
}
