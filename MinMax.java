import java.util.*;

class MinMax {
    public static void main(String args[]) {
        int i, j, min = 0, max = 0, n, temp;
        int a[] = new int[50];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = scanner.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            a[i] = scanner.nextInt();
        }
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for (i = 0; i < n - 1; i++) {
            min = min + a[i];
        }
        for (i = 1; i < n; i++) {
            max = max + a[i];
        }
        System.out.println("Minimum sum: " + min);
        System.out.println("Maximum sum: " + max);
        scanner.close();
    }
}