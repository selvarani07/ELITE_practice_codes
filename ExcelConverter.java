import java.util.Scanner;

public class ExcelConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            if (s.startsWith("R") && Character.isDigit(s.charAt(1)) && s.contains("C")) {
                // RXCY format
                int rIndex = s.indexOf("R");
                int cIndex = s.indexOf("C");
                int row = Integer.parseInt(s.substring(rIndex + 1, cIndex));
                int col = Integer.parseInt(s.substring(cIndex + 1));
                System.out.println(convertToExcel(col) + row);
            } else {
                // Excel format
                int rowStart = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (Character.isDigit(s.charAt(j))) {
                        rowStart = j;
                        break;
                    }
                }
                String colStr = s.substring(0, rowStart);
                String rowStr = s.substring(rowStart);
                int row = Integer.parseInt(rowStr);
                int col = convertToNumber(colStr);
                System.out.println("R" + row + "C" + col);
            }
        }
        scanner.close();
    }

    public static String convertToExcel(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            sb.insert(0, (char) ('A' + n % 26));
            n /= 26;
        }
        return sb.toString();
    }

    public static int convertToNumber(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}