public class SquareExercises {
    public static void main(String[] args) {
        //4A sum of squares first 100 integers
        long sumSquares =0;
        for(int x=1;x<=100;x++){
            sumSquares += (long)x*x;
        }
        System.out.println("Sum of squares 1‑100 = " + sumSquares);

        //4B perfect squares between 1‑100
        System.out.println("\nPerfect squares 1‑100:");
        for(int val=1; val<=100; val++){
            double root = Math.sqrt(val);
            if(root == Math.floor(root)){
                System.out.print(val + " ");
            }
        }
    }
}

