public class PrecisionTest {
    public static void main(String[] args) {
        // Task1 PI 10位小数 double → float
        double piDouble = 3.1415926535;
        float piFloat = (float) piDouble;
        System.out.println("PI double: " + piDouble);
        System.out.println("PI float:  " + piFloat);
        System.out.println("----------------");

        // Task2 23.99 两位小数
        double money1 = 23.99;
        System.out.println("money 23.99 double: " + money1);
        System.out.println("----------------");

        // Task3 23.00
        double money2 = 23.00;
        System.out.println("money 23.00 double: " + money2);
    }
}
