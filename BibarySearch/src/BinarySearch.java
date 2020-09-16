import java.util.Scanner;

public class BinarySearch {
    static int binarySearch(int []arr,int start,int end,int search){
        if(start > end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==search){
            return mid;
        }
        if(search>arr[mid]){
            return binarySearch(arr, mid+1, end, search);
        }
        return binarySearch(arr, start, mid-1, search);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr={4, 401, 389, 221, 268, 384, 383, 280, 340};
        int v=scanner.nextInt();//search value
        int ans=binarySearch(arr, 0, arr.length, v);
        if(ans==-1){
            System.out.println("Element is not present in Array");
        }else{
            System.out.println("Bineary search Index: "+ans);
        }
    }
}
