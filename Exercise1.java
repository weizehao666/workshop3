import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. input 1‑24，小于18 Good day else Good evening
        System.out.print("Enter hour (1‑24): ");
        int hour = sc.nextInt();
        if(hour < 18){
            System.out.println("Good day");
        }else{
            System.out.println("Good evening");
        }

        //2 while loop print multiples of 5 from 10 to95
        System.out.println("\nMultiples of 5 10‑95:");
        int num =10;
        while(num <=95){
            System.out.print(num + " ");
            num +=5;
        }

        //3 sum 1‑10 while loop
        int sum=0;
        int i=1;
        while(i<=10){
            sum +=i;
            i++;
        }
        System.out.println("\nSum from 1 to10 = " + sum);

        sc.close();
    }
}
