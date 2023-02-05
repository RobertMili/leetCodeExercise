package addString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void addString() {
       var result =  solution.addString("11","123");

      assertEquals("134",result);
    }
    @Test
    void addStringsLong() {
        var result =  solution.addString("6913259244","71103343");

        assertEquals("6984362587",result);

    }
}