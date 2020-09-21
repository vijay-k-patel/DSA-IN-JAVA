import java.util.Scanner;

public class SumOfNumberItself {
    static long sum(long n){
        if(n==0){
            return 0;
        }else{
            long ans=(n%10)+sum(n/10);
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
        System.out.println(sum(n));
    }
}
