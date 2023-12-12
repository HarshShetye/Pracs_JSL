class TablePrinter extends Thread {
    private int number;

    public TablePrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by thread for table " + number + ": " + (endTime - startTime) + " ms");
    }
}

public class Q4 {
    public static void main(String[] args) {
        TablePrinter table5 = new TablePrinter(5);
        TablePrinter table7 = new TablePrinter(7);
        TablePrinter table13 = new TablePrinter(13);

        table5.start();
        table7.start();
        table13.start();
    }
}





