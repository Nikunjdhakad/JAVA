class pass {

    // Static variable
    static int attempts = 0;

    // Method to check password strength
    static void checkPassword(String password) {

        attempts++;

        int length = password.length();

        // Simple conditions
        boolean hasNumber = password.matches(".*[0-9].*");
        boolean hasUpper = password.matches(".*[A-Z].*");

        // Using logical + relational operators
        if (length >= 8 && hasNumber && hasUpper) {
            System.out.println("Strong Password ");
        } else if (length >= 5) {
            System.out.println("Medium Password ");
        } else {
            System.out.println("Weak Password ");
        }
    }

    // Method to count vowels in password
    static int countVowels(String password) {
        int count = 0;

        for (int i = 0; i < password.length(); i++) {
            char ch = Character.toLowerCase(password.charAt(i));

            // logical OR operator
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String pass = "Hello123";

        // Check password
        checkPassword(pass);

        // Count vowels
        int vowels = countVowels(pass);
        System.out.println("Vowel count: " + vowels);

        // Ternary operator
        String result = (pass.length() > 6) ? "Good Length" : "Too Short";
        System.out.println(result);

        // Unary operator
        attempts++;
        System.out.println("Total checks: " + attempts);
    }
}