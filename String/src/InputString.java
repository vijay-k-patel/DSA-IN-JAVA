import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();//
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1, 2));
        System.out.println(name.replace('v','p'));
        System.out.println(name.charAt(3));
    }
}
