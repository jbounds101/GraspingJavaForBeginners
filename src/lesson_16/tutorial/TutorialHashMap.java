package lesson_16.tutorial;

/*
A HashMap is a data structure used to store (key: value) pairs, where a value is represented by a key. They are very
quick, since they use a constant time "hashing" function to produce the value from the key where the data item will
be stored. You can search by key in constant time.
*/

import java.util.HashMap;

public class TutorialHashMap {
    public static void main(String[] args) {
        HashMap<String, Double> costsHashMap = new HashMap<>();
        costsHashMap.put("Donut", 1.00);
        costsHashMap.put("Banana", 0.75);
        costsHashMap.put("Chicken", 5.00);
        costsHashMap.put("Filet Mignon", 16.25);
        System.out.println(costsHashMap.get("Filet Mignon")); // Get the value (Filet Mignon : 16.25)
        //                                                                      Key            value
        System.out.println(costsHashMap.get("Apple")); // Doesn't exist, returns null
    }
}
