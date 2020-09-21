import java.util.Scanner;

public class FactorialNumber {
    static long fact(long n){
        if(n==1){
            return 1;
        }else{
            long ans=n*fact(n-1);
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextLong();
        System.out.println(fact(n));
    }
}
