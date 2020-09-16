import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        char []rev=str.toCharArray();
        for (int i =rev.length-1 ; i >=0 ; i--) {
            System.out.print(rev[i]);
        }
    }
}
