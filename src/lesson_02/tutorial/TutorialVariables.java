package lesson_02.tutorial;

public class TutorialVariables {

    // Storing data is essential for computing, that's where variables come in handy.

    public static void main(String[] args) {
        System.out.println("10"); // I could write this, but what if the value changes?

        // Instead we will use variables which can be changed
        int num = 10;
        System.out.println(num);
        num = 12; // We can also reassign the variable, which will get rid of the previous value
        System.out.println(num);
    }

    /*
       I declared an integer using the "int" keyword above, which is a specific "data-type". In this case, an int
       stores an integer number between (-2^31) and (2^31 - 1). I also gave it a name of "num" which is how we refer
       to this value.

       Why is that the range for integers? Computer store values using 0s and 1s (binary), each 0 or 1 in a sequence
       is a "bit", and 8 of those bits together is a "byte"

       bit: 0 or 1
       byte: 01001011

       When using the int keyword, the computer is told to stash 32 bits (4 bytes) to keep that value, we also need
       to account for checking if the number is negative or positive, which one bit is used for, and one of those
       numbers must be zero (hence the -1 on positive numbers). So that range is (-2^31) -> (2^31 - 1)) because each
       bit can hold either 0 or 1, and there are 31 bits.

       These built-in types are called primitive data types, which usually make up larger data objects.
       The others are shown below:

       */

    byte myByte = 0xa; // Stores 8 bits (used rarely, and declared using hex 0x# format)

    short myShort = 11; // Stores 16 bits

    long myLong = 123091809128L; // Stores 64 bits (the L is needed at end to specify between int and long values)

    float myFloat = 1.2311F; // Stores 32 bits w/ decimal (the F is needed to specify between float and double)

    double myDouble = 1.311; // Stores 64 bits w/ decimal

    boolean myBoolean = true; // Stores true or false with a single bit

    char myChar = '#'; // Stores a single letter or digit, use single quotes to specify chars
}
