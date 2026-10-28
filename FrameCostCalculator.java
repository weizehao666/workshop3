import java.util.Scanner;

public class FrameCostCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //a length width
        System.out.print("Enter picture length(inch): ");
        double length = sc.nextDouble();
        System.out.print("Enter picture width(inch): ");
        double width = sc.nextDouble();
        sc.nextLine();

        //b frame type
        System.out.print("Enter frame type (regular/fancy): ");
        String frameType = sc.nextLine();

        //c color choice(只是输入，不参与价格计算)
        System.out.print("Enter frame color: ");
        String color = sc.nextLine();

        //d crowns
        System.out.print("Number of crowns(0 if none): ");
        int crownCount = sc.nextInt();

        double perimeter = 2 * (length + width);
        double colorCost = perimeter * 0.10;
        double frameCost;

        if(frameType.equalsIgnoreCase("regular")){
            frameCost = perimeter * 0.15;
        }else{
            frameCost = perimeter * 0.25;
        }
        double crownCost = crownCount * 0.35;
        double total = colorCost + frameCost + crownCost;

        System.out.println("\n==== Frame Cost Summary ====");
        System.out.println("Picture size: "+length+" x "+width);
        System.out.println("Frame type: "+frameType+", Color: "+color);
        System.out.printf("Total cost: $%.2f%n", total);

        sc.close();
    }
}

