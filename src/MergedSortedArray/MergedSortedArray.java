package MergedSortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergedSortedArray {
    public static void main(String[] args) {

        int[]num1 = {1,2,3,0,0,0};
        int[]num2 = {2,5,6};
        int m  = 3;
        int n = 3;

        merge(num1, m, num2,n);
        System.out.println(Arrays.toString(num1));

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
        }


    }
}

