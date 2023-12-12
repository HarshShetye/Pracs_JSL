class StudentTR {
    public static void main(String[] args) {
        Result r = new Result(16, 0, 95, 90);
        r.score();
    }
}

class Student {
    int rollno;
}

class Test extends Student {
    int sem1_marks, sem2_marks;
}

interface Sports {
    void score();
}

class Result extends Test implements Sports {
    int total, sports_score;

    Result(int rn, int sc, int s1, int s2) {
        this.rollno = rn;
        this.sports_score = sc;
        this.sem1_marks = s1;
        this.sem2_marks = s2;
        this.total = sc + s1 + s2;
    }

    public void score() {
        System.out.println("Roll No: " + rollno + "\nSem1 Marks: " + sem1_marks + "\nSem2 Marks: " + sem2_marks
                + "\nSports Score: " + sports_score);
        System.out.println("Total score: " + total);
    }
}