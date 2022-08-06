package lesson_11.tutorial;

/*
What should we do when something goes wrong in our code?
 */

import java.util.Random;

public class TutorialExceptions {
    public static void main(String[] args) {
        String myString = null; // Creates an initialized string.

        // myString.toUpperCase() will throw a NullPointerException, because we are attempting to capitalize a string
        // that doesn't exist! To avoid this, we use the try catch block.

        try {
            System.out.println(myString.toUpperCase()); // Throws a NullPointerException.
        } catch (NullPointerException e) {
            System.out.println("String isn't initialized!"); // So we go here!
        } finally { // This is the finally-block, which can be used for many cases, typically clean-up, it always
            // runs after try or catch.
            System.out.println("I will always run!");
        }

        // Notice that the thing we catch is important! Notice how we were catching a NullPointerException earlier,
        // now we are trying to catch an ArrayIndexOutOfBoundsException, which isn't being thrown!
        try {
            System.out.println(myString.toUpperCase()); // Throws a NullPointerException.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("String isn't initialized!"); // Uh oh! The error wasn't caught.
        }

        // You can catch all exceptions if you use (Exception e), although this is typically not good practice; it is
        // instead better to catch only the exceptions that you know will be thrown.
    }
}
