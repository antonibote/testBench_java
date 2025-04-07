public class Main {
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Example usage of the Fibonacci function
        int n = 10; // Change this value to test other Fibonacci numbers
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}