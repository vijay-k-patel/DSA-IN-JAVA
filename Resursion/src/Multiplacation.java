/*
Sample Input
2
2 3
3 4
Sample Output
6
12
*/

import java.util.Scanner;

public class Multiplacation {
    static int multiplacation(int N,int M){
        if(N<M) {
            return multiplacation(M, N);
        }else if(M !=  0){
            return (M+multiplacation(M, N-1));
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        System.out.println(multiplacation(N, M));
        //System.out.println(mul);
    }
}
