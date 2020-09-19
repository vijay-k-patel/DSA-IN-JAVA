/*
Sample Input
2
ab
aba
Sample Output
false
true
*/
import java.util.Scanner;

public class PalindromeString {
    static boolean checkPalindrome(String str){
        if(str.length()==0 || str.length()==1){
            return true;
        }else if(str.charAt(0)==str.charAt(str.length()-1)){
            return checkPalindrome(str.substring(1,str.length()-1));
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if(checkPalindrome(str)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
