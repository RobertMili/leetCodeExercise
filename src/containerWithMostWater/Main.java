package containerWithMostWater;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1,1};
        int[] height3 = {4,3,2,1,4};
        solution.maxArea(height);
    }
}

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0; // Left pointer
        int right = height.length - 1; // Right pointer

        while (left < right) {
            // Calculate the width between the two pointers
            int width = right - left;

            // Calculate the height based on the shorter line
            int containerHeight = Math.min(height[left], height[right]);

            // Calculate the area
            int currentArea = width * containerHeight;

            // Update max area if the current one is larger
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointer pointing to the shorter line
            if (height[left] < height[right]) {
                left++; // Move left pointer to the right
            } else {
                right--; // Move right pointer to the left
            }
        }


        return maxArea;
    }
}
