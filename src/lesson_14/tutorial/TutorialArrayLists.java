package lesson_14.tutorial;

/*
Arrays are super useful, but what if we need them to resize? That's when using a built-in object called the ArrayList
is super helpful!
 */

import java.util.ArrayList; // Notice how we need to import the ArrayList
import java.util.Collections;

public class TutorialArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(); // This is how we declare an ArrayList of Integers,
        // ArrayLists require non-primitive types to be used, so we used the upper-case Integer, rather than int
        // (this is called a wrapper class, which helps with integer functionality)

        for (int i = 0; i < 8; i++) {
            integerArrayList.add(i); // Resizes on it's own!
            integerArrayList.add((int) Math.pow(i, i));
        }

        Collections.sort(integerArrayList); // We can use the collections class to sort the ArrayList

        integerArrayList.remove(3); // Can remove a value at a certain index

        for (Integer integer : integerArrayList) {
            System.out.println(integer);
        }
    }
}
