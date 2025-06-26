package Test;

public class StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String concatenation
        String firstName = "Hello";
        String lastName = "World";
        String fullName = firstName + " " + lastName;  // Concatenation using '+'
        System.out.println("Full Name: " + fullName);

        // 2. Length of the string
        int length = fullName.length();
        System.out.println("Length of Full Name: " + length);

        // 3. Substring extraction
        String firstNameExtracted = fullName.substring(0, firstName.length());
        System.out.println("Extracted First Name: " + firstNameExtracted);

        // 4. Character extraction
        char firstChar = fullName.charAt(0);  // first character
        char lastChar = fullName.charAt(fullName.length() - 1);  // last character
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

    }
}