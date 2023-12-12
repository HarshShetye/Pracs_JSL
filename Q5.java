class SharedResource {
    synchronized void printNumbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends Thread {
    SharedResource resource;

    public MyThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.printNumbers();
    }
}

public class Q5 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        MyThread thread1 = new MyThread(resource);
        MyThread thread2 = new MyThread(resource);

        thread1.start();
        thread2.start();
    }
}
