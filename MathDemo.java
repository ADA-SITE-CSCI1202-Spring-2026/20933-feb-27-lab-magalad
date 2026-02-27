public class MathDemo {

    // a) returns the smaller of two integers
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    // b) returns the larger of two integers
    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // c) returns the sum of all elements in the array
    public static int sum(int[] numbers) {
        int total = 0;
        for (int x : numbers) {
            total += x;
        }
        return total;
    }

    // d) returns the mean (average) of elements in the array
    public static float mean(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0f; // avoid division by zero
        }
        return (float) sum(numbers) / numbers.length;
    }

    // e) returns factorial of n (n!)
    public static int factorial(int n) {
        if (n < 0) {
            return 0; // or you could throw an exception, but this is simpler for PP2
        }

        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    /*
     f) Advantage of defining these methods as static:
        - You can call them using the class name without creating an object.
          Example: MathDemo.max(5, 10)
        - They do not depend on instance variables (no object state needed).
        - Similar to Java built-in utility methods like Math.min(), Math.max().
     */

    // Test all methods
    public static void main(String[] args) {

        int a = 10, b = 25;
        System.out.println("min(" + a + ", " + b + ") = " + min(a, b));
        System.out.println("max(" + a + ", " + b + ") = " + max(a, b));

        int[] arr = {5, 2, 9, 1, 7};
        System.out.println("sum(arr) = " + sum(arr));
        System.out.println("mean(arr) = " + mean(arr));

        int n = 5;
        System.out.println("factorial(" + n + ") = " + factorial(n));

        System.out.println("\nStatic advantage: No object needed -> MathDemo.max(5, 10)");
    }
}