package lesson_03.test;

import lesson_03.exercise.ExerciseFlowControl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class TestFlowControl {

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
    public void testHighA() {
        ExerciseFlowControl.main(true, 99);
        assertEquals("You got an A+", outContent.toString().trim().replace("\r\n", "\n"));
    }
    @Test
    public void testLowA() {
        ExerciseFlowControl.main(true, 90);
        assertEquals("You got an A-", outContent.toString().trim().replace("\r\n", "\n"));
    }
    @Test
    public void testA() {
        ExerciseFlowControl.main(true, 95);
        assertEquals("You got an A", outContent.toString().trim().replace("\r\n", "\n"));
    }
    @Test
    public void testHighB() {
        ExerciseFlowControl.main(true, 89.9);
        assertEquals("You got a B+", outContent.toString().trim().replace("\r\n", "\n"));
    }
    @Test
    public void testLowB() {
        ExerciseFlowControl.main(true, 80);
        assertEquals("You got a B-", outContent.toString().trim().replace("\r\n", "\n"));
    }
    @Test
    public void testB() {
        ExerciseFlowControl.main(true, 86);
        assertEquals("You got a B", outContent.toString().trim().replace("\r\n", "\n"));
    }
    @Test
    public void testBadGrade() {
        ExerciseFlowControl.main(true, 79.99);
        assertEquals("You got a very bad grade :(", outContent.toString().trim().replace("\r\n", "\n"));
    }
    @Test
    public void testExtremelyBadGrade() {
        ExerciseFlowControl.main(true, 20);
        assertEquals("You got a very bad grade :(", outContent.toString().trim().replace("\r\n", "\n"));
    }
    @Test
    public void testZeroGrade() {
        ExerciseFlowControl.main(true, 0);
        assertEquals("You got a very bad grade :(", outContent.toString().trim().replace("\r\n", "\n"));
    }
    @Test
    public void testNotAStudent() {
        ExerciseFlowControl.main(false, 86);
        assertEquals("Not a student!", outContent.toString().trim().replace("\r\n", "\n"));
    }


}