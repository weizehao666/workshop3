import java.util.Scanner;

public class NumberToLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer between 0‑35: ");
        int n = sc.nextInt();

        if(n <=9){
            System.out.println(n);
        }else{
            // A is ASCII 65, n=10 → 65 + 0
            char ch = (char)(65 + (n - 10));
            System.out.println(ch);
        }
        sc.close();
    }
}

