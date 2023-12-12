class ResultStudent {
    public static void main(String[] args) {
        // int mrk[] = new int[]{94,67,-3,109,5};
        Result r = new Result("Harsh Shetye", 16, "12/12/2023", 4, 109,
                5);
        r.giveResult();
    }
}

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String s) {
        System.out.println(s);
    }
}

class Result {
    int seatno, cno, n, marks;
    String date = new String();
    String name = new String();

    Result(String nm, int s, String d, int center, int m, int no) {
        this.name = nm;
        this.date = d;
        this.seatno = s;
        this.cno = center;
        this.marks = m;
        this.n = no;
    }

    void giveResult() {
        System.out.println("Name: " + name);
        System.out.println("Date: " + date);
        System.out.println("Seat No: " + seatno);
        System.out.println("Center No: " + cno);
        try {
            if (marks > 100 || marks < 0) {
                throw new MarksOutOfBoundsException("Exception: Marks out of range");
            } else {
                System.out.println("Marks for subject: " + marks);
            }
        } catch (MarksOutOfBoundsException e) {
            System.out.print(e);
        }
    }
}