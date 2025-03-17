
class StringMeth {

    static void print(Object s) {
        System.out.println(s);
    }

    public static void main(String... args) {

        //// Introduction to Java Strings
        // In Java, a String is an immutable sequence of characters.
        // It is represented by the String class in java.lang package.
        // Strings in Java are objects and are stored in the string pool for memory efficiency.
        // Strings can be created in two ways:

        String s1 = "Hello";
        print(s1);

        String s2 = new String("Hello");
        print(s2);

        //// Important Features of Strings
        // Immutable: Once created, a string cannot be changed.
        // Stored in the String Pool: If a string with the same value exists, it is reused.
        // Efficient Memory Usage: String pool prevents duplicate objects.

        print("java".length());
        print("java".charAt(1));
        print("java".substring(2,4));
        print("java".concat(" is easy!"));
        print("java".equals("java"));
        print("java".equalsIgnoreCase("JAVA"));

        //// StringBuffer and StringBuilder
        // Since String is immutable, modifying a string creates a new object. For mutable string operations, use:
        
        // StringBuffer (Thread-safe but slower)
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" world");
        print(sb);

        //StringBuilder (Faster, but not thread-safe)
        StringBuilder sbu = new StringBuilder("String");
        sbu.append(" Builder");
        print(sbu);

        //// Performance Considerations
        // Use String when modifications are rare.
        // Use StringBuilder for faster string manipulations in a single-threaded environment.
        // Use StringBuffer when multiple threads modify the string.

        //// summary
        // String is immutable, while StringBuffer and StringBuilder are mutable.
        // Use StringBuilder for fast modifications.
        // Use StringBuffer in multi-threaded environments.
        // Use methods like length(), substring(), replace(), and split() to work with strings efficiently.
    }
}
