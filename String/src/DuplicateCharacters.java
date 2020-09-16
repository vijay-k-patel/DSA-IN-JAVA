import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int cnt=0;
        char [] input=str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for(int j=i+1;j<str.length();j++){
                if(input[i]==input[j]){
                    System.out.print(input[j]+" ");
                    cnt++;
                    break;
                }
            }
        }
    }
}
