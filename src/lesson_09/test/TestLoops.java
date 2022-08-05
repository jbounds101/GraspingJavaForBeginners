package lesson_09.test;

import lesson_09.exercise.ExerciseLoops;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TestLoops {

    // Set up the output stream to test for println
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    // Tests start here
    @Test
    public void testCatLives() {
        ExerciseLoops.catLives();
        assertEquals("9 lives remaining.\n" +
                "8 lives remaining.\n" +
                "7 lives remaining.\n" +
                "6 lives remaining.\n" +
                "5 lives remaining.\n" +
                "4 lives remaining.\n" +
                "3 lives remaining.\n" +
                "2 lives remaining.\n" +
                "1 lives remaining.\n" +
                "Poor cat :(", outContent.toString().trim().replace("\r\n", "\n"));
    }
}