import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        StringBuffer sb = new StringBuffer(input);
        String reversed = sb.reverse().toString();

        if(input.equals(reversed)){
            System.out.println(input + " is a palindrome");
        }else{
            System.out.println(input + " is NOT a palindrome");
        }
        scanner.close();
    }
}
