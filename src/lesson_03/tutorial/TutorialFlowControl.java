package lesson_03.tutorial;

public class TutorialFlowControl {
    // Comparisons and branches paths are what make programming so versatile, this is done primarily through the use
    // of the "if" statement

    public static void main(String[] args) {

        int bigNumber = 1000;
        // Notice the syntax for if statements
        if (bigNumber > 1000) { // This checks if "bigNumber" is greater than 1000
            System.out.println("That really is a big number!");
        }
        if (bigNumber <= 1000) { // This checks if "bigNumber" is less than or equal to 1000
            System.out.println("That number isn't that big!");
        }


        int pennies = 100;
        if (pennies == 100) { // To compare "if-equal-to" we use the double equal (==)
            System.out.println("You have one dollar!");
        }


        boolean catsLikeDogs = false;
        if (catsLikeDogs) { // For boolean, you can drop the double equal sign (==) since it is implied
            System.out.println("Cats have achieved harmony with dogs!");
        } else { // The else statement will run the surrounding block if the above is statement was false
            System.out.println("Cats still don't like dogs!");
        }


        double grade = 78.2;
        if (grade >= 90) {
            System.out.println("You got a A");
        } else if (grade >= 80) { // Notice how you can use else if to evaluate another expression
            System.out.println("You got a B");
        } else if (grade >= 70) {
            System.out.println("You got a C");
        } else if (grade >= 60) {
            System.out.println("You got a D");
        } else {
            System.out.println("You got an F");
        }
    }
}
