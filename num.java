class num {

    // Static variable
    static int totalChecks = 0;

    // Method to check even or odd
    static void checkEvenOdd(int num) {
        String result = (num % 2 == 0) ? "Even" : "Odd"; // ternary
        System.out.println("Even/Odd: " + result);
        totalChecks++;
    }

    // Method to check positive, negative or zero
    static void checkSign(int num) {
        if (num > 0) {
            System.out.println("Positive Number");
        } else if (num < 0) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Zero");
        }
        totalChecks++;
    }

    // Method to find square
    static int square(int num) {
        totalChecks++;
        return num * num; // arithmetic
    }

    public static void main(String[] args) {

        int number = 7;

        // Calling methods
        checkEvenOdd(number);
        checkSign(number);

        int sq = square(number);
        System.out.println("Square: " + sq);

        // Logical + relational operator
        if (number > 0 && number < 100) {
            System.out.println("Number is between 1 and 99");
        }

        // Unary operator
        totalChecks++;
        System.out.println("Total operations: " + totalChecks);
    }
}