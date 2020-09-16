import java.util.Scanner;

public class MergeTwoSortedArray {
     static int[] mergeTwoSortArrays(int[] a, int[] b,int n,int m){
        int i = 0, j =0, k = 0;
        int[] c = new int[n + m];
        while(i < n && j < m){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
            }else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        while(i < n){
            c[k] = a[i];
            k++;
            i++;
        }

        while(j < m){
            c[k] = b[j];
            k++;
            j++;
        }

        return c;
    }

    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=scanner.nextInt();
        }
        int m=scanner.nextInt();
        int b[]=new int[m];
        for (int i = 0; i < m; i++) {
            b[i]=scanner.nextInt();
        }
        int [] mergedArray=mergeTwoSortArrays(a,b,n,m);
        print(mergedArray);
    }
}
