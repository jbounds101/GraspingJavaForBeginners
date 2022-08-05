package lesson_09.solution;

public class SolutionLoops {
    public static void catLives() {
        for (int i = 9; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println("Poor cat :(");
            } else {
                System.out.println(i + " lives remaining.");
            }
        }
    }
}
