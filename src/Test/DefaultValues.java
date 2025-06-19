package Test;
// Write a Java program to declare variables of all primitive data types and print their default values.

public class DefaultValues {
    // Primitive data types with default values
    byte byteVar;
    short shortVar;
    int intVar;
    long longVar;
    float floatVar;
    double doubleVar;
    char charVar;
    boolean booleanVar;
    public static  void main(String[] args) {
        DefaultValues obj = new DefaultValues();


        System.out.println("Default value of byte: " + obj.byteVar);
        System.out.println("Default value of short: " + obj.shortVar);
        System.out.println("Default value of int: " + obj.intVar);
        System.out.println("Default value of long: " + obj.longVar);
        System.out.println("Default value of float: " + obj.floatVar);
        System.out.println("Default value of double: " + obj.doubleVar);
        System.out.println("Default value of char: [" + obj.charVar + "]");
        System.out.println("Default value of boolean: " + obj.booleanVar);
    }
}


