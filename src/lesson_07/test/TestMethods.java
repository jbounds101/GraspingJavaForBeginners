package lesson_07.test;

import lesson_07.exercise.ExerciseMethods;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class TestFlowControl {

    // Tests start here
    @ParameterizedTest
    @ValueSource(strings = { "Racecar", "Fish", "Donkey", "Administrator!", "", "\nNewline at the start?" })
    public void testEmphasize(String arg) {
        String ret = ExerciseMethods.emphasize(arg);
        assertEquals((arg + "!").toUpperCase(Locale.ROOT), ret);
    }
}