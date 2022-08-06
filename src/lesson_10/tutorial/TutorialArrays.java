package lesson_10.tutorial;

/*
What if we want to store multiple values with a single variable? That's when arrays can be utilized!
 */


public class TutorialArrays {
    int[] myNum = new int[3];
    // You add "[]" after a data type declaration to create an array of that type, you must specify the size of an
    // array on creation

    // That being said, we don't have to create an array on variable declaration, for example:
    static int[] penguins; // This tells us that, at some point in our code, we want to have an array called penguins


    public static void main(String[] args) {
        penguins = new int[2]; // Now we can use the array
        // To set the numbers at each index, we can use the array index syntax:
        penguins[0] = 10;
        penguins[1] = 32; // Notice how the index only goes to 1, the maximum index of an array is always the size-1

        String[] fishes = new String[]{"Bass", "Guppy", "Mackerel"}; // You can also declare the items inline

        for (int i = 0; i < fishes.length; i++) { // Arrays are great in conjunction with loops, notice how we can use
            // the fishes.length field to increment over the array
            System.out.println(fishes[i]);
        }

        System.out.println("");

        for (String fish : fishes) { /* This is also another way to loop over any array, notice how it puts the value
                                        from each iteration into the variable fish, which can be used in the array */
            System.out.println(fish);
        }
    }
}