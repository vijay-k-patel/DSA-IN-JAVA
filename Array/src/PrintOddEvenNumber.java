
public class PrintOddEvenNumber {
    static void rearrangeEvenAndOdd(int arr[])
    {
        int j = -1,temp;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                j++;

                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
        //int n = arr.length;
        rearrangeEvenAndOdd(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

