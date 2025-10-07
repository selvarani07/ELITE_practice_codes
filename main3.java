import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(); // use long since n can be up to 1e8
            System.out.println(2 * n);
        }
    }
}

