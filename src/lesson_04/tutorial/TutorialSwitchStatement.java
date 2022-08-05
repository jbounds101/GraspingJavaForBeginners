package lesson_04.tutorial;

// Note: this lesson doesn't have an exercise attached.

public class TutorialSwitchStatement {
    public static void main(String[] args) {
        int position = 1;
        switch (position) { // A switch statement is essentially an if-else block, you specify a variable to run on
            // and use case statements to determine the effect
            case 1: // Notice the syntax
                System.out.println("You are the winner!");
                break; // You must use break at the end of the case, or it will "run-through" the code below, try
                       // removing the break here to see. Sometimes it can be useful to not use a break!
            case 2:
                System.out.println("You came in second-place!");
                break;
            case 3:
                System.out.println("You came in third-place!");
                break;
        }
    }
}
