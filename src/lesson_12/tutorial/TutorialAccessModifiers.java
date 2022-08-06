package lesson_12.tutorial;

/*
What is this "public static void main" nonsense I keep seeing? Well, we know the last two. Void is the return type,
and main is the name of the function. But what about "public static". These are access modifiers, and they can be put
on any method or variable. They control what is able to access them.

Let's start with static, normally, functions and variables are by-default non-static (meaning if you don't write static,
they will be non-static). A static function is a function that belongs to the class. That means that instead of using
an object of that class to call the method on, we use the class instead. The same is true for static variables, which
are shared across files because they belong to the class.

Access modifiers:
public: can be accessed anywhere
private: can only be accessed within the class
protected: can be accessed by the class, package (any files in the same folder), and any subclasses (we will learn
later!)
package-protected (default, if no modifier is given): can be accessed by the class, and in the same package

A good rule of thumb is to use private unless you have an obvious reason not to, private ensures that data isn't
randomly changed by another file

 */

public class TutorialAccessModifiers {

    private static final boolean pastriesToday = true; // This belongs to the class, and can only be used by the
    // class, final means that the variable is constant, and cannot be changed

    public static void main(String[] args) {
        // So we are saying that "main" is "public" (can be accessed anywhere), "static" (a member of
        // TutorialAccessModifiers without being an object), and returns nothing (void).

        int cash = 1002; // This is also static, despite not having the modifier (you can't use it here), it inside a
        // static function, which assumes all interior variables are static
    }

}
