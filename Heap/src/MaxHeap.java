//implementation of heap
public class MaxHeap {
        int[] data;
        int size;
        MaxHeap(int maxHeapSize){
            data=new int[maxHeapSize];
            size=0;
        }
        void add(int element){
           data[size]=element;
           int childIndex=size;
           int parentIndex=(childIndex-1)/2;
           while (parentIndex>=0 && data[childIndex]>data[parentIndex]){
               //swap parent child
               int temp=data[childIndex];
               data[childIndex]=data[parentIndex];
               data[parentIndex]=temp;
               //update the parentchild
               childIndex=parentIndex;
               parentIndex=(childIndex-1)/2;
           }
           size++;
        }
        int remove() {
            int value = data[0];
            data[0] = data[size - 1];
            size = size - 1;

            int parentIndex = 0;
            while (parentIndex < size) {
                int leftChildIndex = 2 * parentIndex + 1;
                int rightChildIndex = 2 * parentIndex + 2;

                int largestOf3Index = parentIndex;
                if (leftChildIndex < size && data[leftChildIndex] > data[largestOf3Index]) {
                    largestOf3Index = leftChildIndex;
                }
                if (rightChildIndex < size && data[rightChildIndex] > data[largestOf3Index]) {
                    largestOf3Index = rightChildIndex;
                }
                if (largestOf3Index != parentIndex) {
                    int temp = data[parentIndex];
                    data[parentIndex] = data[largestOf3Index];
                    data[largestOf3Index] = temp;
                    //update
                    parentIndex = largestOf3Index;
                }else {
                    break;
                }
            }
            return value;
        }
        int peek(){
            return data[0];
        }

}


