package lesson_07.tutorial;

/*
Methods are functions that belong to a class object. What is a function? A function is a segment of code that can be
called using its name. For example, you could have a function called sayHello(), calling sayHello() might print
multiple lines that say "Hello", "Bonjour", etc.

To use a method, we first must have an object to use it on! For example, when we use a string, we can run a method
such as "donuts".toUpper() to convert that string into upper case. We can also create static methods, which belong to
the class itself, rather than an object of that class. String.valueOf() is an example of a static method.
 */

public class TutorialMethods {
    public static void main(String[] args) {
        ping(); // We can call the static method here!
        int myNumber = 0;
        myNumber = addTen(myNumber); // We use the return value of the method to override myNumber's value
        System.out.println(myNumber);
    }

    // This is a static method, defined as part of the TutorialMethods class
    public static void ping() {
        System.out.println("Pong!");
    }

    // The int before "addTen" in this case is the return type, it also takes an integer argument
    public static int addTen(int num) {
        return num + 10;
    }
}
