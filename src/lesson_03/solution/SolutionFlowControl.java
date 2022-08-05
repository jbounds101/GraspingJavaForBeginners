package lesson_03.solution;

public class SolutionFlowControl {
    public static void main(boolean isStudent, double grade) {
        if (isStudent) {
            if (grade >= 97) {
                System.out.println("You got an A+");
            } else if (grade >= 93) {
                System.out.println("You got an A");
            } else if (grade >= 90) {
                System.out.println("You got an A-");
            } else if (grade >= 87) {
                System.out.println("You got a B+");
            } else if (grade >= 83) {
                System.out.println("You got a B");
            } else if (grade >= 80) {
                System.out.println("You got a B-");
            } else {
                System.out.println("You got a very bad grade :(");
            }
        } else {
            System.out.println("Not a student!");
        }
    }
}
