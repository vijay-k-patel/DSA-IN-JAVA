import java.util.Scanner;

//special case if we do not know array is sorted in ascending order or descending order
public class OrderAgnosticSearch {
    static int orderagnosticSearch(int arr[],int n ,int value){
        int start=0;
        int end=n-1;
        while (start<=end){
            int mid=start+(end-start)/2;
                if(arr[mid]==value){
                    return mid;
                }
            if(arr[0]<arr[1] ){
                if(arr[mid]<value){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else if(arr[0]>arr[1]){
                if(arr[mid]>value){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr={50,40,35,33,30,25,27,23,20,19,15,14,12,10,9,6,5,3,1};
        int n=arr.length;
        int value=scanner.nextInt();
        int ans=orderagnosticSearch(arr, n, value);
        if(ans==-1){
            System.out.println("Element not present in array");
        }else{
            System.out.println("Binary search index is :"+ ans);
        }
    }
}
