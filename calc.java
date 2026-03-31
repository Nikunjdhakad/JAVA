class calc {

    // Static variable
    static int count = 0;

    // Method to add two numbers
    static int add(int a, int b) {
        count++;
        return a + b; // arithmetic operator
    }

    // Method to check even or odd
    static void checkEvenOdd(int num) {
        // relational + logical + ternary operator
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + result);
    }

    // Method to find max of two numbers
    static int findMax(int x, int y) {
        if (x > y && x != y) {   // logical AND + relational
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {

        int a = 10, b = 5;

        // Arithmetic operations
        int sum = add(a, b);
        int diff = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);

        // Logical + relational operators
        if (a > b || b == 0) {   // OR operator
            System.out.println("Condition is true");
        }

        // Method call
        checkEvenOdd(a);

        int max = findMax(a, b);
        System.out.println("Max value: " + max);

        // Unary operator
        count++;
        System.out.println("Method calls count: " + count);
    }
}