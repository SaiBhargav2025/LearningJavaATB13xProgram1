package Test;

public class Increment {
    public static void main(String[] args) {
        int i = 5;

        System.out.println("Initial value of i: " + i);

        // Post-increment: i++
        System.out.println("Using i++: " + (i++));
        System.out.println("Value of i after i++: " + i);

        // Pre-increment: ++i
        System.out.println("Using ++i: " + (++i));
        System.out.println("Value of i after ++i: " + i);
    }
}

