import java.util.*;

class Discount10 {
    public static void main(String args[]) {
        int units;
        double ppu, total_cost;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Units: ");
        units = scanner.nextInt();
        System.out.println("Enter price of each unit: ");
        ppu = scanner.nextInt();
        total_cost = units * ppu;
        if (total_cost > 1000) {
            total_cost = total_cost * 0.9;
        }
        System.out.println("Total final Cost: " + total_cost);
        scanner.close();
    }
}