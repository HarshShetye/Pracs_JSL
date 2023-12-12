import java.util.*;

class Shopping {
    public static void main(String[] args) {
        Vector sl = new Vector(3, 2);
        Scanner sc = new Scanner(System.in);
        String ele = new String();
        while (true) {
            System.out
                    .print("\nMENU\n1.Add element to pos\n2.Delete an item\n3.Print list\n4.Exit\nEnter your choice:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("\nEnter position: ");
                    int pos = sc.nextInt();
                    System.out.print("\nEnter element: ");
                    ele = sc.next();
                    if (pos <= sl.size()) {
                        sl.insertElementAt(ele, pos - 1);
                    } else {
                        sl.addElement(ele);
                    }
                    break;
                case 2:
                    System.out.print("\nEnter element: ");
                    ele = sc.next();
                    sl.removeElement(ele);
                    break;
                case 3:
                    System.out.println("\nCurrent list: ");
                    System.out.println(sl);
                    break;
                case 4:
                    System.exit(0);
            }
        }
        // sc.close();
    }
}