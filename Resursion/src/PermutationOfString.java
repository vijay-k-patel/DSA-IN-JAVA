/*
Sample Input:
ABC
Sample Output:
ABC ACB BAC BCA CAB CBA
*/
import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfString {
    static void perm(String remaining,String bulit){
        if(remaining.length()==0){
            System.out.print(bulit+" ");
        }else{
            int len=remaining.length();
            for(int i=0;i<len;i++){
                char selected=remaining.charAt(i);
                String newRemaining=remaining.substring(0,i)+remaining.substring(i+1);

                String newbuilt=bulit+selected;
                perm(newRemaining, newbuilt);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w=scanner.next();
        char[] charArr=w.toCharArray();
        Arrays.sort(charArr);
        w=new String(charArr);
        perm(w,"");
    }
}
