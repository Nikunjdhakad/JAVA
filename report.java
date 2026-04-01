class report {

    // Static variable (shared by all students)
    static String collegeName = "CDGI Indore";

    // Instance variables
    String name;
    int marks[];

    // Constructor
    report(String name, int marks[]) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate total marks
    int calculateTotal() {
        int total = 0;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];  // assignment + arithmetic
        }

        return total;
    }

    // Method to calculate average
    double calculateAverage() {
        int total = calculateTotal();
        return total / marks.length;
    }

    // Method to assign grade
    String getGrade() {
        double avg = calculateAverage();

        // relational + logical + ternary
        return (avg >= 90) ? "A" :
               (avg >= 75 && avg < 90) ? "B" :
               (avg >= 50 && avg < 75) ? "C" : "Fail";
    }

    // Method to check pass/fail
    boolean isPassed() {
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 33) {   // relational
                return false;
            }
        }
        return true;
    }

    // Display student report
    void displayReport() {
        System.out.println("College: " + collegeName);
        System.out.println("Student: " + name);

        int total = calculateTotal();
        double avg = calculateAverage();

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + getGrade());

        // logical NOT operator
        if (!isPassed()) {
            System.out.println("Status: Fail");
        } else {
            System.out.println("Status: Pass");
        }
    }

    public static void main(String[] args) {

        int marks1[] = {85, 90, 78, 88, 92};

        report s1 = new report("sraju", marks1);

        s1.displayReport();

        // Unary operator
        int x = 5;
        System.out.println("Unary Example: " + (++x));  // pre-increment

        // Compound assignment
        x += 10;   // same as x = x + 10
        System.out.println("After += : " + x);
    }
}