package lesson_02.test;

import lesson_02.exercise.ExerciseVariables;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class TestVariables {

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
    public void testOutput() {
        ExerciseVariables.main(new String[0]);
        assertEquals("Value of myInt: 10\n" +
                "Value of myDouble: 1.322\n" +
                "Value of myChar: A\n" +
                "Value of myBool: false", outContent.toString().trim().replace("\r\n", "\n"));
    }
}