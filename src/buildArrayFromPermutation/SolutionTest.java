package buildArrayFromPermutation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void test(){
        int[] array = {0,2,1};
        int[] expected = {0,1,2};

        var result = solution.buildArray(array);


        assertEquals(Arrays.toString(expected),Arrays.toString(result));
    }

}