import java.util.Scanner;

public class QuickSort {
    static void quickSort(int[]arr,int start,int end){
        if(start>end){
            return;
        }
        int pivot = arr[end];
        int p = partition(arr,pivot,start, end);
        quickSort(arr, start, p - 1);
        quickSort(arr, p + 1, end);
    }
    public static int partition(int[] arr, int pivot, int start, int end) {
        // System.out.println("pivot -> " + pivot);
        int i = start, j = start;
        while (i <= end) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return (j - 1);
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        quickSort(arr, 0, arr.length-1);
        print(arr);
    }
}
