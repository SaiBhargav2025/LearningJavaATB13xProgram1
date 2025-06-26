package Test;

public class StringComparisonDemo2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = "hello";

        // 1. Using == operator (checks reference equality)
        System.out.println("s1 == s2: " + (s1 == s2)); // true, both refer to same literal in pool
        System.out.println("s1 == s3: " + (s1 == s3)); // false, s3 is a new object
        System.out.println("s1 == s4: " + (s1 == s4)); // false, different literals and case

        // 2. Using equals() method (checks content equality, case-sensitive)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s1.equals(s4): " + s1.equals(s4)); // false, different case

        // 3. Using equalsIgnoreCase() (content equality, case-insensitive)
        System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4)); // true

        // 4. Using compareTo() method (lexicographical comparison)
        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2)); // 0 (equal)
        System.out.println("s1.compareTo(s3): " + s1.compareTo(s3)); // 0 (equal)
        System.out.println("s1.compareTo(s4): " + s1.compareTo(s4)); // negative (H < h)
        System.out.println("s4.compareTo(s1): " + s4.compareTo(s1)); // positive (h > H)
    }
}
