package lesson_06.tutorial;

/*
Strings are a very useful data object used for storing words and character sequences.
Remember primitive data types? Strings are a sequence of chars and are actually an object.
 */


public class TutorialStrings {
    public static void main(String[] args) {
        String myString = "Programming with strings is amazing! You can do so much!";
        /*
        Notice how you declare strings with a capital "S", that is because we are referring to an object or class,
        by convention, objects and classes are capitalized. See how TutorialStrings, which is this Java class, is
        capitalized.
         */

        String quote = "\"To be, or not to be, that is the question\"\n";
        /*
        We use quotations to declare a string, but what if we want quotes in our string? That's when we use the
        escape-character, the back-slash! Using it before a key character will allow it to be used in a string.
        There are a bunch of escape-characters, a commonly used one is "\n", which is the newline character.
        That is actually what println adds to the end of a string!

        See: https://www.javatpoint.com/java-escape-characters for all the escape-characters
         */


        System.out.println(myString); // Adds "\n" to the end of the string
        System.out.print(quote); // Prints the string "as-is"
        System.out.println(myString + " WOWEE!! " + quote); // We can combine them too!

        /*
        Strings are technically data structures, called arrays (which we will learn in-depth next lesson),
        essentially they are a sequential list of data values.

        Your computer sees strings as such (a list of characters):
        'P', 'r', 'o', 'g', 'r','a', 'm', 'm', 'i', 'n', 'g', ...

        Because of this, we can get a certain character from an index, what if, for example, we wanted to get the
        first letter of myString?

        Note: all indices in programming begin at 0 for the first element, 1 for the second, and so on...

         */

        char firstLetter = myString.charAt(0); // Get the first letter of the string
        System.out.println("The first letter of myString is: " + firstLetter + "\n\n\n");

        /*
        What is myString.charAt(0) doing?

        charAt() is a "method" of the String class. We can tell this because of the .method() syntax. A method is a
        block of code that belongs to a certain object.

        In this case, we are running that block of code called charAt(0) to determine the character value at a
        certain index on the String object we initialized. Methods allow for objects to have their own specific
        functionality.

        Another useful (and very commonly used) String method is .subString(int startIndex, int endIndex);
        Notice how methods have "parameters", which specify the required type, and what they do. For substring, we
        require an integer value for the start and end index of the substring we want to create.
         */

        String vader = "I don't like sand.";
        // If we wanted to get the substring "sand" we can use substring! Remember: indices start at 0, so charAt(0)
        // in this case would = 'I'
        System.out.println(vader.substring(13, 17));

        /*
        If you are having trouble understanding this section, the next lesson will go in-depth with methods and
        functions. We will go into more functional strings in lesson 08.
         */


    }
}
