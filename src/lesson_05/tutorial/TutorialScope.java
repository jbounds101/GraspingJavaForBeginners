package lesson_05.tutorial;

// Note: this lesson doesn't have an exercise attached.

/* What is scope? Scope refers to the ability to reference a variable within a certain block of code. For example,
the foo variable below is in the scope of the class TutorialScope (notice the curly braces). "bar" is in the scope of
main().

Variables can be used from any scope, so long as it is their current scope or deeper.

For example, notice how it is possible to compare foo and bar, despite foo being outside of main()

 */

public class TutorialScope { // 1 (In Intellij, you can click the curly brace to highlight the scope on the left).
                             // This will also highlight the corresponding ending brace.

    static int foo = 900;

    public static void main(String[] args) { // 2
        int bar = 100;
        if (foo == bar) { // 3
            System.out.println("foo and bar are equal!");

            boolean isEqual = true; // This is useless code if nothing happens after it! The variable (and memory from
            // the variable) will be automatically reclaimed after exiting this scope
        } // 3
        // isEqual has been destroyed, attempting to reference it will result in a compile error
    } // 2
    // bar is destroyed, the inner value is gone


    static int bar = 99; // Notice how I can redeclare bar, it doesn't exist here since it was reclaimed
} // 1
