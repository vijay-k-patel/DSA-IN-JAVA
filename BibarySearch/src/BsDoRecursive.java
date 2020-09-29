import java.util.Scanner;

public class BsDoRecursive {
    static int binarySearchDecending(int arr[],int start,int end,int value){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==value){
            return mid;
        }
        if(start>value){
            binarySearchDecending(arr, mid+1, end, value);
        }
        return binarySearchDecending(arr, start, mid-1, value);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr={50,40,35,33,30,25,27,23,20,19,15,14,12,10,9,6,5,3,1};
        int n=arr.length;
        int value=scanner.nextInt();
        int ans=binarySearchDecending(arr,0,n, value);
        if(ans==-1){
            System.out.println("Element not present in array");
        }else{
            System.out.println("Binary search index is :"+ ans);
        }
    }
}
