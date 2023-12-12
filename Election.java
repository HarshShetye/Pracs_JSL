import java.util.*;

class Election {
    public static void main(String[] args) {
        int i, n, j;
        int a[] = new int[50];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            System.out.print((i + 1) + " Vote: ");
            a[i] = sc.nextInt();
        }
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, sv = 0;
        for (i = 0; i < n; i++) {
            if (a[i] == 1) {
                c1 += 1;
            } else if (a[i] == 2) {
                c2 += 1;
            } else if (a[i] == 3) {
                c3 += 1;
            } else if (a[i] == 4) {
                c4 += 1;
            } else if (a[i] == 5) {
                c5 += 1;
            } else {
                sv += 1;
            }
        }
        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5 + " " + sv);
        sc.close();
    }
}