import java.util.Scanner;

public class SumOfNaturalNumber {
    static long sum(long n){
        if(n==1){
            return 1;
        }else{
            long ans=n+sum(n-1);
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(sum(n));
    }
}
