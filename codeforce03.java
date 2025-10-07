import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int passengers = 0;   
        int maxCapacity = 0; 

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); 
            int b = sc.nextInt(); 

             passengers -= a;     
            passengers += b;     

            
            if (passengers > maxCapacity) {
                maxCapacity = passengers;
            }
        }

        System.out.println(maxCapacity);
        sc.close();
    }
}
