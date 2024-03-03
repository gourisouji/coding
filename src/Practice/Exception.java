package Practice;
public class Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; // Change this value to the denominator you want to use

        try {
            int result = divide(a, b);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero is not allowed.");
        }
        System.out.println("hello");
        
    }

    public static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero.");
        }
        return a / b;
    }
}
