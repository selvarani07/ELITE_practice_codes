import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  // number of friends
        int h = sc.nextInt();  // height of fence
        int width = 0;

        for (int i = 0; i < n; i++) {
            int ai = sc.nextInt(); // height of friend
            if (ai <= h) {
                width += 1; // walks normally
            } else {
                width += 2; // bends down
            }
        }

        System.out.println(width);
        sc.close();
    }
}
