import java.util.Scanner;

//Java program to count the occurrences of each character
public class CountTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            //System.out.println(str.charAt(i)+" ");
            if(str.charAt(i)!=' '){
                count++;
            }

        }
        System.out.print(count);

    }
}
