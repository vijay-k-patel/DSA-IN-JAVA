import java.util.Scanner;

public class NumberPresentInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int T1=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

            if(arr[i]==T1){
                System.out.println("TRUE");
            }else{
                System.out.println("FALSE");
            }
        }
    }
}
