import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int arr[],int n){
        if(n==1){
            return;
        }
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        bubbleSort(arr, n-1);
    }
    static void print(int []arr,int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int  arr []=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        bubbleSort(arr,n);
        print(arr, n);
    }
}

