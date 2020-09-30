import java.util.Scanner;

public class SortedArrayRoteted {
    static int binarySearch(int [] arr,int n){
        int start=0;
        int end=n-1;
        while(start<=end){
            if(arr[start]<arr[end]){
                return start;
            }
            int mid=start+(end-start)/2;
            int next=(mid+1)%n;
            int prev=(mid-1+n)%n;

            if(arr[mid]<=arr[next] && arr[mid]<=arr[prev]){
                return mid;
            }else if(arr[mid]>=arr[start]){
                start=mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr={4, 5, 6, 7, 1, 2, 3};
        int n= arr.length;
        int ans=binarySearch(arr,n);
        if(ans==-1){
            System.out.println("Element is not present in Array");
        }else{
            System.out.println("The array is rotated : " + ans);
        }
    }
}
