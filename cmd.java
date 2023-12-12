import java.util.Scanner;

class cmd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string of characters: ");
        String x = sc.nextLine();
        int validCount = 0;
        int invalidCount = 0;
        for (int i = 0; i < x.length(); i++) {
            try {
                int num = Integer.parseInt(
                        Character.toString(x.charAt(i)));
                validCount += 1;
            } catch (NumberFormatException e) {
                invalidCount += 1;
            }
        }
        System.out.println("valid integers : " + validCount);
        System.out.println("Invalid Integers : " + invalidCount);
        sc.close();
    }
}