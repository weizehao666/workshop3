public class DebtCasting {
    public static void main(String[] args) {
        long usDebt = 37000000000000L;
        System.out.println("Original long debt: " + usDebt);

        // long → int 强制窄化，溢出，数值改变
        int debtInt = (int) usDebt;
        System.out.println("Cast long to int: " + debtInt);

        // double存国债，再强制转byte
        double debtDouble = 37000000000000.0;
        byte debtByte = (byte) debtDouble;
        System.out.println("Cast double debt to byte: " + debtByte);
    }
}
