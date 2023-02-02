package buildArrayFromPermutation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void test(){
        int[] array = {0,2,1};
        int[] expected = {0,1,2};
        solution.buildArray(array);

        assertEquals(expected,array);
    }

}