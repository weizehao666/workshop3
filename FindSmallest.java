import java.util.Scanner;

public class FindSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a = sc.nextInt();
        System.out.print("Enter number 2: ");
        int b = sc.nextInt();
        System.out.print("Enter number 3: ");
        int c = sc.nextInt();

        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;

        System.out.println("Smallest number is: " + min);
        sc.close();
    }
}

