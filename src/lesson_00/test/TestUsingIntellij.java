


// --------------------------------------------------
// Go-to the txt file first if you have not already!
// --------------------------------------------------




package lesson_00.test;
import lesson_00 .exercise.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class TestUsingIntellij {

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
    public void testOutputSucceed() {
        RunMe.main(new String[0]);
        assertEquals("Hello! Welcome to Java-Programming.\n" +
                "There's so much you can do with Java!", outContent.toString().trim().replace("\r\n",
                "\n"));
    }
    @Test
    public void testOutputFail() {
        RunMe.main(new String[0]);
        assertEquals("Hello! Welcome to Java-Programming.\n" +
                "There's so much you can do with Java!", "This output is wrong but it isn't your fault!");
    }
}