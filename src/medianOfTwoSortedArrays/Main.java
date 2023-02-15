package medianOfTwoSortedArrays;

import java.util.Arrays;

public class Main {
}
class Solution {
  public double findMedianSortedArrays(int[]nums1, int[]nums2) {

    int[] sortedArray = new int[nums1.length + nums2.length];

    int index = 0;
    for (int j : nums1) {
      sortedArray[index++] = j;
    }
    for (int j : nums2) {
      sortedArray[index++] = j;
    }

    Arrays.sort(sortedArray);

    int minimum = sortedArray[0];
    int maximum = sortedArray[sortedArray.length - 1];

    double sum = minimum + maximum;

    double result = sum / 2;

    return result;
  }
}
