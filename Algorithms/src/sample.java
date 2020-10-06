import java.util.Scanner;

public class sample {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int z=0;z<t;z++) {
            int n = sc.nextInt();
            int res = count(n,1);
            System.out.println(res);
        }

    }
    static int count(int n,int i) {
        if(n==i)
            return 1;
        else if(n<i)
            return 0;
        return count(n-i,i+1) + count(n,i+1) ;
    }
}
