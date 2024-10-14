package RemoveDuplciatesFromSortedArray;


import org.junit.jupiter.api.Test;
//
//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplciatesFromSortedArrayTest {

  Solution solution = new Solution();
    @Test
    void firstTest() {

        int[]nums = {1,1,2};
        var result = solution.removeDuplicates(nums);

        assertEquals(2,result);
    }

    @Test
    void firstTest2() {

        int[]nums = {-3,-1,0,0,0,3,3};
        var result = solution.removeDuplicates(nums);
        System.out.println(result);

        assertEquals(4,result);
        //testing github
        //testing
    }
}