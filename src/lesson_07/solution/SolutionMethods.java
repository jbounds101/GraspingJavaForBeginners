package lesson_07.solution;

import java.util.Locale;

public class SolutionMethods {
    public static String emphasize(String toEmphasize) {
        toEmphasize += "!";
        return toEmphasize.toUpperCase(Locale.ROOT);
    }
}
