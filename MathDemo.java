public class MathDemo {

    // 7(a) - return the smaller of two integers
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    // main method to test min()
    public static void main(String[] args) {

        int x = 10;
        int y = 25;

        int result = min(x, y);

        System.out.println("Minimum of " + x + " and " + y + " is: " + result);

        // Additional test
        System.out.println("Minimum of 7 and 3 is: " + min(7, 3));
    }
}