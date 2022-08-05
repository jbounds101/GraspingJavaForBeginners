package lesson_08.solution;

public class SolutionStringMethods {
    public static String formalize(String toModify) {
        if ((toModify.indexOf('?')) != -1 || (toModify.indexOf('!') != -1)) {
            return toModify;
        } else {
            char first = toModify.charAt(0);
            String suffix = toModify.substring(1).toLowerCase();
            return first + suffix;
        }
    }
}