import java.util.Scanner;

public class SelectionSort {
    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void selectionSort(int arr[],int n){
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            swap(arr,min,i);
        }
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
        selectionSort(arr,n);
        print(arr,n);
    }
}
