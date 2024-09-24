package Kattis;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class ProblemBTest {



    @Test
    void testGetMaxColorChanges() {
        String input = "7 8\n" +
                "1 2\n" +
                "1 3\n" +
                "2 4\n" +
                "3 4\n" +
                "4 5\n" +
                "4 6\n" +
                "5 7\n" +
                "6 7\n";
        String expectedOutput = "3\n"; // Example expected output

        // Set up input and output streams
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        ProblemB.main(new String[]{});

        // Check the output
        assertEquals(expectedOutput, out.toString());
    }

    @Test
    void testGetMaxColorChanges2() {
        String input = "3 3\n" +
                "1 3\n" +
                "1 2\n" +
                "2 3\n";
        String expectedOutput = "0\n"; // Example expected output

        // Set up input and output streams
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        ProblemB.main(new String[]{});

        // Check the output
        assertEquals(expectedOutput, out.toString());
    }

    @Test
    void testGetMaxColorChanges3() {
        String input = "10 15\n" +
                "1 2\n" +
                "2 3\n" +
                "3 4\n" +
                "4 5\n" +
                "5 6\n" +
                "6 7\n" +
                "7 8\n" +
                "8 9\n" +
                "9 10\n" +
                "10 1\n" +
                "1 3\n" +
                "2 4\n" +
                "3 5\n" +
                "4 6\n" +
                "5 7\n" +
                "6 8\n";
        String expectedOutput = "5\n"; // Example expected output

        // Set up input and output streams
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        // Run the main method
        ProblemB.main(new String[]{});

        // Check the output
        assertEquals(expectedOutput, out.toString());
    }



    }