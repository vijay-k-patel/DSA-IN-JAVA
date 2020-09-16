import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int arr[],int n){
        for (int i = 1; i < n; i++) {
            int value=arr[i];
            int j=i;

            while (j>0 && arr[j-1]>value){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=value;
        }
    }
    static void print(int []arr,int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int  arr []=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        insertionSort(arr,n);
        print(arr, n);
    }
}
