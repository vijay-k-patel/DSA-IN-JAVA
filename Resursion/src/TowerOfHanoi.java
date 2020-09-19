/*
Input
2
Output
1:A->B
2:A->C
1:B->C
*/
import java.util.Scanner;
public class TowerOfHanoi {
    //n=input,from=A,to=C,aux=B
    static void move(int n,char from, char to,char aux){
        //base case
        if(n==1){
            //manually move nth disk A->C
            System.out.println(n+":"+ from+"->"+to);
        }else{
            //from=A,aux=B,to=C
            move(n-1, from, aux, to);
            System.out.println(n+":"+from+"->"+to);
            //n-1,aux=B,to=C,from=A
            move(n-1, aux, to,from);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        move(n,'A', 'C', 'B');
    }
}
