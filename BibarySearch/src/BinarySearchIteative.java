import java.util.Scanner;

public class BinarySearchIteative {
    static int binarySearch(int arr[],int v,int n){
        int start=0;
        int end=n-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==v){
                return mid;
            }
            if(arr[mid]<v){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7,8,9,10,45,80,90};
        int v=scanner.nextInt();//search value
        int n=arr.length;
        int ans=binarySearch(arr,v,n);
        if(ans==-1){
            System.out.println("Element is not present in Array");
        }else{
            System.out.println("Binary search Index: "+ans);
        }
    }
}
