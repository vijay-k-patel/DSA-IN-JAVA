import java.util.Scanner;

public class ElementInCicularSortedArray {
    static int binarySearch(int arr[],int n,int v){
        int start=0;
        int end=n-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(v==arr[mid]){
                return mid;
            }
            if(arr[mid]<=arr[end]){
                if(v>arr[mid] && v<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(v>=arr[start]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr={4, 5, 6, 7, 1, 2, 3};
        int n= arr.length;
        int v=scanner.nextInt();
        int ans=binarySearch(arr,n,v);
        if(ans==-1){
            System.out.println("Element is not present in Array");
        }else{
            System.out.println("The element found at index : " + ans);
        }
    }
}
