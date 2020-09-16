import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String To Integer
        String s=scanner.nextLine();
        int i=Integer.parseInt(s);
        System.out.println("Integer "+i);
        //Integer to string
        int n=scanner.nextInt();
        String s1=Integer.toString(n);
        System.out.println("String "+s1);
    }
}
