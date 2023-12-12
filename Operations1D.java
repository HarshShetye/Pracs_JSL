import java.util.*;

class Operations1D {
    public static void main(String[] args) {
        int i, j, n, temp, choice;
        int a[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("MENU\n1. Search element\n2. Sort descending\n3. Delete Duplicate\nEnter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                int flag = 0, ele;
                System.out.println("Enter element to be searched: ");
                ele = sc.nextInt();
                for (i = 0; i < n; i++) {
                    if (a[i] == ele) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    System.out.println(ele + " has been found!");
                } else {
                    System.out.println(ele + " not found!");
                }
                break;
            case 2:
                for (i = 0; i < n - 1; i++) {
                    for (j = 0; j < n - 1; j++) {
                        if (a[j] < a[j + 1]) {
                            temp = a[j];
                            a[j] = a[j + 1];
                            a[j + 1] = temp;
                        }
                    }
                }
                for (i = 0; i < n; i++) {
                    System.out.print(a[i] + " ");
                }
                break;
            case 3:
                int tem[] = new int[n];
                int count = 0;
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
                    if (a[i] != a[i + 1]) {
                        tem[count++] = a[i];
                    }
                }
                tem[count++] = a[n - 1];
                for (i = 0; i < count; i++) {
                    System.out.print(tem[i] + " ");
                }
                break;
            default:
                System.out.println("Enter a number between 1-3.");
        }
        sc.close();
    }
}
