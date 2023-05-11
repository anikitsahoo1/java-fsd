public class TypeCasting {
    public static void main(String[] args) {
        // Implicit type casting
        int intValue = 10;
        double doubleValue = intValue;

        System.out.println("Implicit type casting:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);

        // Explicit type casting
        double doubleNum = 3.14;
        int intNum = (int) doubleNum;

        System.out.println("\nExplicit type casting:");
        System.out.println("double number: " + doubleNum);
        System.out.println("int number: " + intNum);
    }
}
