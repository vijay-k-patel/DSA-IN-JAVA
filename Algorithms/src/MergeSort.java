import java.util.Scanner;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int start, int end) {
        if(start == end){
            int[] baseArray = new int[1];
            baseArray[0] = arr[start];
            return baseArray;
        }
        int mid = (start + end) / 2;
        int[] leftSortedArray = mergeSort(arr,start,mid);
        int[] rightSortedArray = mergeSort(arr,mid + 1,end);
        int[] ans = mergeTwoSortedArrays(leftSortedArray,rightSortedArray );
        return ans;
    }
    static int[] mergeTwoSortedArrays(int[] a, int[] b){
        int i = 0, j =0, k = 0;
        int[] c = new int[a.length + b.length];
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
            }else{
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while(i < a.length){
            c[k] = a[i];
            k++;
            i++;
        }

        while(j < b.length){
            c[k] = b[j];
            k++;
            j++;
        }

        return c;
    }
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        int []finalSortArray=mergeSort(arr,0,arr.length-1);
        print(finalSortArray);
    }
}
