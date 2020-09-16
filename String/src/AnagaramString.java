/*
*Given two strings a and b consisting of lowercase characters.
* The task is to check whether two given strings are an anagram of each other or not.
* An anagram of a string is another string that contains the same characters, only the order of characters can be different.
*For example, “act” and “tac” are an anagram of each other.
* Print "YES" without quotes if the two strings are anagram else print "NO".
* Sample Input
naman
manan

Sample Output
YES

Explanation: Both String contain 2 'a's, 2 'n's and 1 'm'.
*/
import java.util.Arrays;
import java.util.Scanner;

public class AnagaramString {
    static boolean checkAnagram(String s1,String s2){
        if(s1.length() != s2.length()){
            return false;
        }else {
            char[] arr1=s1.toCharArray();
            char[] arr2=s1.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return (Arrays.equals(arr1, arr2));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        if(checkAnagram(s1,s2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
