import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int odd=0;
        int even=0;
        int oddCount=0;
        int evenCount=0;
        int[] a = new int[t];
        for (int i = 0; i < t; i++) {
            a[i] = scanner.nextInt();


            if (a[i] % 2 == 0) {
                even += a[i];
                evenCount++;
            } else {
                odd += a[i];
                oddCount++;
            }


        }
        System.out.println("Sum of even numbers "+even);
        System.out.println("Sum of odd numbers "+odd);
        System.out.println("Total even number in array "+evenCount);
        System.out.println("Total odd number in array "+oddCount);
        int minElement=a[0];
        int maxElement=a[0];
        for(int i=1;i<t;i++) {
            if (a[i] > maxElement) {
                maxElement = a[i];
            }

            if (a[i] < minElement) {
                minElement = a[i];
            }
        }
        System.out.println("Min Number "+minElement);
        System.out.println("Max Number "+maxElement);


    }
}
