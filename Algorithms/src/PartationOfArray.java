public class PartationOfArray {

    public static void main(String[] args) {
        int arr[] = {5, 10, 9, 8, 6,7};
        int p = partition(arr, 0, arr.length-1);
        System.out.println("Final pivot index "+ p);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int partition(int[] a, int start, int end) {
        int p = end;
        int i = 0;
        int j = end - 1;
        while (i < j) {
            while (i < j && a[i] < a[p]) {
                i++;
            }
            while (j > i && a[j] >= a[p]) {
                j--;
            }
            int temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
        if (a[i] < a[p]) {
            i++;
        }
        int temp = a[p];
        a[p] = a[i];
        a[i] = temp;

        return i;
    }
}
