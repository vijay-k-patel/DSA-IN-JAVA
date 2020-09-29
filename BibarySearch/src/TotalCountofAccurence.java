import java.util.Scanner;

public class TotalCountofAccurence {
    static int binarySearch(int arr[],int n,int v,boolean searchFirst){
        int start=0;
        int end=n-1;
        int result=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==v){
                result=mid;
                if(searchFirst){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else if(v<arr[mid]){
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
        int first=binarySearch(arr, n , v,true);
        int last=binarySearch(arr, n , v,false);
        int ans = last - first + 1;
        if(ans==-1){
            System.out.println("Element is not present in Array");
        }else{
            System.out.println("Total Occurrences "+ans);
        }
    }
}
