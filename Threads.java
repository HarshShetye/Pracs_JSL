class Threads {
    public static void main(String[] args) {
        Booking d = new Booking(1);
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.setName("Harsh");
        t2.setName("Alistair");
        t2.start();
        t1.start();
    }
}

class Booking extends Thread {
    int vacant = 1, reqd;

    Booking(int r) {
        this.reqd = r;
    }

    public synchronized void run() {
        if (reqd <= vacant) {
            System.out.println(reqd + " ticket(s) booked for " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            vacant = vacant - reqd;
        } else {
            System.out.println("No tickets left. Sorry, " + Thread.currentThread().getName());
        }
    }
}