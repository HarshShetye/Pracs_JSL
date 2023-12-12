import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int validCount = 0;
        int invalidCount = 0;

        System.out.println("Enter integers (enter 'q' to quit):");

        while (true) {
            try {
                String input = scanner.next();
                if (input.equals("q")) {
                    break;
                }

                int num = Integer.parseInt(input);
                if (num >= 0 && num <= 100) {
                    validCount++;
                } else {
                    invalidCount++;
                }
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Total valid integers: " + validCount);
        System.out.println("Total invalid integers: " + invalidCount);

        scanner.close();
    }
}





