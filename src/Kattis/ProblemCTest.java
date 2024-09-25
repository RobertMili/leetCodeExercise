//package Kattis;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//
//class ProblemCTest {
//
//    // Helper function to simulate input/output
//    private String runProblemC(String input) {
//        // Setup input
//        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        // Setup output
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
//
//        // Call main method of ProblemC
//        ProblemC.main(new String[]{});
//
//        // Return the output as a string
//        return out.toString();
//    }
//
//    @Test
//    void testExample1() {
//        String input = "3 5\n";
//        String expectedOutput =
//                    " _ _ _ _ _\n" +
//                    "| | | | | |\n" +
//                    "|         |\n" +
//                    "|_|_|_|_|_|\n";
//
//        String actualOutput = runProblemC(input);
//        assertEquals(expectedOutput, actualOutput);
//    }
//
//    @Test
//    void testExample2() {
//        String input = "2 2\n";
//        String expectedOutput =
//                    " _ _\n" +
//                    "| | |\n" +
//                    "|_ _|\n";
//
//        String actualOutput = runProblemC(input);
//        assertEquals(expectedOutput, actualOutput);
//    }
//
//
//
//}
