class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

class StudentResult {
    String name;
    int seatNo;
    String date;
    int centerNumber;
    int marks;
    public StudentResult(String name, int seatNo, String date, int centerNumber, int marks)
            throws MarksOutOfBoundsException {
        if (marks < 0 || marks > 100) {
            throw new MarksOutOfBoundsException("Marks should be between 0 and 100");
        }
        this.name = name;
        this.seatNo = seatNo;
        this.date = date;
        this.centerNumber = centerNumber;
        this.marks = marks;
    }

    public void displayResult() {
        System.out.println("Name: " + name);
        System.out.println("Seat No: " + seatNo);
        System.out.println("Date: " + date);
        System.out.println("Center Number: " + centerNumber);
        System.out.println("Marks: " + marks);
    }
}

public class Q3 {
    public static void main(String[] args) {
        try {
            StudentResult student = new StudentResult("First Last", 68, "2023-10-10", 5678, 95);
            student.displayResult();
        } catch (MarksOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



