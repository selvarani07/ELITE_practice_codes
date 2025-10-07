import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // columns
        sc.nextLine(); // consume newline
        
        boolean ok = true;
        char prevRowColor = '#'; // placeholder that won't match digits 0–9

        for (int i = 0; i < n; i++) {
            String row = sc.nextLine().trim();
            
            // check row uniform
            char first = row.charAt(0);
            for (int j = 1; j < m; j++) {
                if (row.charAt(j) != first) {
                    ok = false;
                }
            }

            // check different from previous row
            if (i > 0 && first == prevRowColor) {
                ok = false;
            }

            prevRowColor = first;
        }
        
        System.out.println(ok ? "YES" : "NO");
    }
}
