package lesson_08.tutorial;

/*
Strings are a common data type used throughout Java, knowing how to utilize them effectively is a useful skill for
any programmer.
 */

public class TutorialStringMethods {
    // Lets go over some common string methods
    public static void main(String[] args) {
        String hw = "Hello World!";
        System.out.println(hw.toUpperCase()); // Converts string to uppercase
        System.out.println(hw.toLowerCase());
        System.out.println(hw.substring(6)); // Creates a substring of the current string,
        // starting at the specified index
        System.out.println(hw.substring(0, 6)); // Creates a substring from the starting index (inclusive) to the end
        // index (exclusive)
        System.out.println(hw.replace('!', '?')); // Replaces all characters of a certain type to another
        System.out.println(hw.charAt(0)); // Gets the character at a certain index
        System.out.println(hw.indexOf("!")); // Gets the index of a specified character, if it isn't present, return -1
    }
}
