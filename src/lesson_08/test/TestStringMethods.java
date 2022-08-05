package lesson_08.test;

import lesson_08.exercise.ExerciseStringMethods;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class TestStringMethods {

    // Tests start here
    @ParameterizedTest
    @ValueSource(strings = { "RaCECAr", "FISH", "donkEY", "AdmInIstratoR!" })
    public void testFormalize(String toModify) {
        if ((toModify.indexOf('?')) == -1 && (toModify.indexOf('!') == -1)) {
            char first = toModify.charAt(0);
            String suffix = toModify.substring(1).toLowerCase();
            String normalized = first + suffix;
            assertEquals(normalized, ExerciseStringMethods.formalize(toModify));
            return;
        }
        assertEquals(toModify, ExerciseStringMethods.formalize(toModify));
    }
}