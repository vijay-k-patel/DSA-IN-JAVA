import java.util.Scanner;

public class LsatOccurenceInBS {
    static int binarySearch(int arr[],int n,int v){
        int start=0;
        int end=n-1;
        int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==v){
                result=mid;
                start=mid+1;
            }if(arr[mid]>v){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr={4, 5, 6, 6, 6, 6, 6 ,6, 7};
        int n=arr.length;
        int v=scanner.nextInt();//search value
        int ans=binarySearch(arr, n , v);
        if(ans==-1){
            System.out.println("Element is not present in Array");
        }else{
            System.out.println("Binary search Index: "+ans);
        }
    }
}
