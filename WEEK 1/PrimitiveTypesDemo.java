public class PrimitiveTypesDemo {
    public static void main(String[] args) {
        // Declaring variables of all eight primitive data types
        byte byteVar = 10;                 // 1 byte, range -128 to 127
        short shortVar = 2000;             // 2 bytes
        int intVar = 45000;                // 4 bytes
        long longVar = 123456789L;         // 8 bytes, note the 'L' suffix
        float floatVar = 3.14f;            // 4 bytes, note the 'f' suffix
        double doubleVar = 3.14159265;     // 8 bytes
        char charVar = 'A';                // 2 bytes, single Unicode character
        boolean booleanVar = true;         // 1 bit (JVM dependent), true/false
 
        // Displaying the values of each primitive variable
        System.out.println("byte    : " + byteVar);
        System.out.println("short   : " + shortVar);
        System.out.println("int     : " + intVar);
        System.out.println("long    : " + longVar);
        System.out.println("float   : " + floatVar);
        System.out.println("double  : " + doubleVar);
        System.out.println("char    : " + charVar);
        System.out.println("boolean : " + booleanVar);
    }
}
