package addBinary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void addBinary() {

        var result = solution.addBinary("11","1");

        assertEquals("100",result);
    }
    @Test
    void addBinarySecondTest() {

        var result = solution.addBinary("1010","1011");

        assertEquals("10101",result);
    }
    @Test
    void addBinaryVeryLong() {

        var result = solution.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011");

        assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000",result);
    }
}