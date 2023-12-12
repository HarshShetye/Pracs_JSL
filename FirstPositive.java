import java.util.*;

class FirstPositive {
    public static void main(String[] args) {
        int i, n, j, temp;
        int a[] = new int[50];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print((i + 1) + " Value: ");
            a[i] = sc.nextInt();
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
        int minm = a[0];
        for (i = 0; i < n; i++) {
            if (a[i] != minm) {
                if (minm == 0) {
                    System.out.println("Missing value is: " + ++minm);
                } else {
                    System.out.println("Missing value is: " + minm);
                }
                break;
            }
            minm++;
        }
        sc.close();
    }
}