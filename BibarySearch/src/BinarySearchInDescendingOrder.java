import java.util.Scanner;

public class BinarySearchInDescendingOrder {
    static int binarySearchDecending(int arr[],int n,int value){
        int start=0;
        int end=n-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==value){
                return mid;
            }
            if(arr[mid]>value){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr={50,40,35,33,30,25,27,23,20,19,15,14,12,10,9,6,5,3,1};
        int n=arr.length;
        int value=scanner.nextInt();
        int ans=binarySearchDecending(arr, n, value);
        if(ans==-1){
            System.out.println("Element not present in array");
        }else{
            System.out.println("Binary search index is :"+ ans);
        }
    }
}
