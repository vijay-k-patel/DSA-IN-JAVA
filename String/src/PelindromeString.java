import java.util.Scanner;

public class PelindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        int left=0;
        int right=str.length()-1;
        while (left<=right){
            if(str.charAt(left)!=str.charAt(right)){
                System.out.println("False");
            }
            left++;
            right--;
        }
        System.out.println("True");
    }
}
