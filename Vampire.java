import java.util.*;

class Vampire {
    public static void main(String[] args) {
        int n, i = 0, j, temp, k, l;
        int a[] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 dig no: ");
        n = sc.nextInt();
        int og = n;
        while (n > 0) {
            temp = n % 10;
            a[i++] = temp;
            n = n / 10;
        }
        int num1, num2;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (i != j) {
                    num1 = 10 * a[i] + a[j];
                    for (k = 0; k < 4; k++) {
                        if (k != i && k != j) {
                            for (l = 0; l < 4; l++) {
                                if (l != i && l != j && l != k) {
                                    num2 = 10 * a[k] + a[l];
                                    if (num1 * num2 == og) {
                                        System.out.println(
                                                og + " is a Vampire number with solution " + num1 + " , " + num2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        sc.close();
    }
}
