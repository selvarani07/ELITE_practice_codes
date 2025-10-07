import java.util.Scanner;

public class FriendlyPair {

    // Function to calculate sum of divisors of a number
    static int sumOfDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Get sum of divisors
        int sumA = sumOfDivisors(a);
        int sumB = sumOfDivisors(b);

        // Check Friendly Pair condition
        if ((sumA * b) == (sumB * a)) {
            System.out.println(a + " and " + b + " are Friendly Pair numbers.");
        } else {
            System.out.println(a + " and " + b + " are NOT Friendly Pair numbers.");
        }

        sc.close();
    }
}
