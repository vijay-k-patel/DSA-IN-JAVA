import java.util.Scanner;

public class FindIndexPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();

            int arr[] = new int[N];
            for (int j = 0; j < N; j++) {
                arr[j] = scanner.nextInt();
            }
            boolean f = false;
            for (int j = 0; j < N; j++) {
                if (arr[j] == X) {
                    System.out.print(j + " ");
                    f = true;
                }
            }
            if(f==false){
                System.out.println("Not Fount");
            }else {
                System.out.println();
            }

        }
    }
}
