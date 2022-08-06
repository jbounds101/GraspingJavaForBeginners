package lesson_13.tutorial;

/*
Objects are the heart of Java programming. A non-static class can be used to create objects.
 */

public class TutorialObjects {
    public static void main(String[] args) {
        Dog sparky = new Dog("Sparky", "Bulldog", true, 8); // This uses the constructor from
        // Dog.java to create a new instance of a Dog (using the new keyword)

        sparky.name = "Sparky II"; // Notice how we can access the fields (the variables of an object) using the ".",
        // just like we can access methods the same way

        // We can't access any of the other fields though, remember, those fields are private, so we can use methods
        // to get those values, notice how in Dog.java, there are methods called get#() and set#()
        System.out.println(sparky.getAge());

        Dog puppy = new Dog("Donut", "Poodle", false, 1); // Create another dog!
        puppy.bark(); // Call a method called bark() from Dog.java
        puppy.setAge(2);
        System.out.println(puppy.getAge());

        sparky.bark();
        System.out.println("The total number of barks is: " + Dog.numberBarks); // See how we use the class
        // name for static methods
    }
}
