import java.util.*;

public class JamesBlackboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }

            int count = 0;
            for (int row = 1; row <= n; row++) {
                if (match(row, n, a)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
    static boolean match(int startRow, int n, int[] a) {
        int m = a.length;
        int idx = 0;
        int row = startRow;
        int col = 1;

        while (idx < m && row <= n) {
            if (a[idx] != col) return false;
            idx++;
            col++;
            if (col > row) {
                row++;
                col = 1;
            }
        }

        return idx == m; 
    }
}

