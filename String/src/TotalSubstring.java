
import java.util.Scanner;

public class TotalSubstring {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            for(int j=i+1;j<=str.length();j++){
                String ans=str.substring(i, j);
                System.out.println(ans);
            }
        }
    }
}
