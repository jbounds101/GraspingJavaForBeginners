package lesson_09.tutorial;

/*
Loops are fundamental in programming, they allow a segment of code to be repeated multiple times
 */

public class TutorialLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { // for loops have the basic syntax (var to initialize, repeat while true,
            // increment or decrement variable)

            System.out.println(i + ": Hi!");

            // For example, this loop initializes i to 0, and loops while i < 10, and increments i on each loop
        }

        boolean catsHateRain = true;
        int numCats = 10;
        while (catsHateRain) { // A while loop is an infinite loop, and only stops when the given statement is false
            System.out.println(numCats + " cats hate rain!");
            numCats++;
            if (numCats == 13) {
                catsHateRain = false;
            }
        }

        while (true) {
            System.out.println("This is useless!");
            break; // You can use the break keyword to exit a for or while loop immediately, you can also use
            // continue in for loops to instantly increment the loop and start from the top again
        }
    }
}
